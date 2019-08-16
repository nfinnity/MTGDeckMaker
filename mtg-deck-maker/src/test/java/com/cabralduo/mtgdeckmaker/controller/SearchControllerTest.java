//package com.cabralduo.mtgdeckmaker.controller;
//
//import com.cabralduo.mtgdeckmaker.service.CardServiceImpl;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest
//public class SearchControllerTest {
//
//    private MockMvc mockMvc;
//
//    @Autowired
//    CardServiceImpl searchService;
//
//    @Before
//    public void setUp() {
//        mockMvc = MockMvcBuilders.standaloneSetup(new SearchController(searchService))
//                .build();
//    }
//
//    @Test
//    public void postTest() {
//
//    }
//
//    @Test
//    public void what_does_it_do() throws Exception {
//
//        mockMvc.perform( MockMvcRequestBuilders
//                .get("/search/bef16a71-5ed2-4f30-a844-c02a0754f679")
//                .accept(MediaType.TEXT_PLAIN))
//                .andDo(print())
//                .andExpect(status().isOk());
//    }
//
//}