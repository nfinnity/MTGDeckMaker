package com.cabralduo.mtgdeckmaker.service;

import com.cabralduo.mtgdeckmaker.entity.SearchCriteria;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class SearchService {

    public String formatSearchCriteria(SearchCriteria searchCriteria) {
        ArrayList<String> searchFields = new ArrayList<>(Arrays.asList(searchCriteria.getSearchFields().split(" ")));
        String search = searchFields.get(0);
        for(int i = 1; i < searchFields.size(); i++){
            search += "+" + searchFields.get(i);
        }

        return search;
    }
}
