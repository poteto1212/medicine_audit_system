package com.example.medicine_audit_system.controller.api.v1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerTest {
    private MockMvc mockMvc;
    

    @BeforeEach
    void setup(){
        this.mockMvc = MockMvcBuilders.standaloneSetup(new GreetingController()).build();
        
    }

    @Test
    public void test() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/greeting"))
        .andExpect(MockMvcResultMatchers.status().isOk());

    }
    
}
