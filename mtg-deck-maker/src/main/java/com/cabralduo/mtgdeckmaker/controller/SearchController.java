package com.cabralduo.mtgdeckmaker.controller;

import com.cabralduo.mtgdeckmaker.entity.Card;
import com.cabralduo.mtgdeckmaker.entity.SearchCriteria;
import com.cabralduo.mtgdeckmaker.service.SearchService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Controller
public class SearchController {

    private static final String SCRYFALL_API_CARD_SEARCH = "https://api.scryfall.com/cards/named?fuzzy=";
    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @RequestMapping(value = "/search",  method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> search(@RequestBody SearchCriteria searchCriteria) throws IOException {
        String search = searchService.formatSearchCriteria(searchCriteria);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response =  restTemplate.getForEntity(SCRYFALL_API_CARD_SEARCH + search, String.class);

        ObjectMapper mapper = new ObjectMapper();
        Card cards = mapper.readValue(response.getBody(), Card.class);
        return response;
    }
}
