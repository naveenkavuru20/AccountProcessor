package com.example.intuitCraftDemo.Integration;

import com.example.intuitCraftDemo.controller.IntuitController;
import com.example.intuitCraftDemo.entity.Account;
import com.example.intuitCraftDemo.respository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(IntuitController.class)
public class IntuitControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserRepository service;

    @Test
    public void greetingShouldReturnMessageFromService() throws Exception {
//        when(service.findAccountByEmailAddress("abc@gmail.com")).thenReturn(new Account());
//        this.mockMvc.perform(post("/user")).andDo(print()).andExpect(status().isOk())
//                .andExpect(content().string(containsString("Hello, Mock")));
    }
}
