package com.cabralduo.mtgdeckmaker.controller;

import com.cabralduo.mtgdeckmaker.entity.Card;
import com.cabralduo.mtgdeckmaker.service.CardService;
import com.cabralduo.mtgdeckmaker.service.api.UpdateDatabase;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SearchController {

    private final UpdateDatabase updateDatabase;
    private final CardService cardService;

    public SearchController(UpdateDatabase updateDatabase, CardService cardService) {
        this.updateDatabase = updateDatabase;
        this.cardService = cardService;
    }

    @GetMapping("/update")
    public String update() {
        updateDatabase.updateTables();
        System.out.println("hi");

        return "views/index";
    }

    private List<Card> cards;

    @GetMapping({"", "/"})
    public String index() {

        return "views/index";
    }

    @PostMapping("/search")
    public String searchPost(String searchCriteria) {

        cards = cardService.getCardByName(searchCriteria);

        return "redirect:/search";
    }

    @GetMapping("/search")
    public String searchGet(Model model) {

        model.addAttribute("cards", cards);

        return "views/search";
    }

    @GetMapping("/search/{id}")
    public String showDetail(Model model, @PathVariable("id") String id) {

        model.addAttribute("card", cardService.getCardById(id));

        return "views/show";
    }
}
