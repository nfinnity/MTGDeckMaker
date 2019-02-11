package com.cabralduo.mtgdeckmaker.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class SearchController {

    @RequestMapping("/search")
    public ResponseEntity<String> search() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity("https://api.scryfall.com/cards/named?fuzzy=aust+com", String.class);
    }
}
