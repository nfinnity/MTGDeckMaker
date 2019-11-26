package com.cabralduo.mtgdeckmaker.service.api;

import com.cabralduo.mtgdeckmaker.entity.Card;
import com.cabralduo.mtgdeckmaker.repository.CardRepository;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class UpdateDatabaseTest {

    @Autowired
    CardRepository cardRepository;

    @Test
    public void checkFileNotNull() {
        try {
            ClassLoader classLoader = getClass().getClassLoader();
            JsonReader reader = new JsonReader(new InputStreamReader(new FileInputStream(classLoader.getResource("static/scryfall-all-cards.json").getFile()), "UTF-8"));
            Gson gson = new GsonBuilder().create();

            reader.beginArray();

            int count = 0;

            while(reader.hasNext()) {
                Card card = gson.fromJson(reader, Card.class);

                assertNotNull(card);
                count++;
                if(count > 10) {
                    break;
                }
            }

        } catch(IOException e) {
            e.printStackTrace();
        }
    }

}