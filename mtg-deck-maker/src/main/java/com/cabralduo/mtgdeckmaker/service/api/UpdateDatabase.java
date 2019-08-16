package com.cabralduo.mtgdeckmaker.service.api;

import com.cabralduo.mtgdeckmaker.entity.Card;
import com.cabralduo.mtgdeckmaker.repository.CardRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Service
@Slf4j
public class UpdateDatabase {

    private final CardRepository cardRepository;
    private final RestTemplate restTemplate;

    public UpdateDatabase(CardRepository cardRepository, RestTemplate restTemplate) {
        this.cardRepository = cardRepository;
        this.restTemplate = restTemplate;
    }

    public void updateTables() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();

            Gson gson = new GsonBuilder().create();

            JsonReader reader = new JsonReader(new InputStreamReader(new FileInputStream(classLoader.getResource("static/scryfall-all-cards-test.json").getFile()), "UTF-8"));

            int count = 0;

            reader.beginArray();

            while(reader.hasNext()) {
                Card card = gson.fromJson(reader, Card.class);

                card.setRules(restTemplate.getForObject(card.getRulingsUri(), Card.class).getRules());

                cardRepository.save(card);
                log.info("Card saved: " + count++);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}