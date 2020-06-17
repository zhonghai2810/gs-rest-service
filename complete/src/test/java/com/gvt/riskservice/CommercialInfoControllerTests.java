package com.gvt.riskservice;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
public class CommercialInfoControllerTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void correctTokenShouldReturnSuccessMessage() throws Exception {
        this.mockMvc.perform(post("/commercial-info")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"token\":\"GVT2020VALID\"}")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().contentType("application/json;charset=utf-8"))
                .andExpect(jsonPath("$.tianYanChaInfo.companyName").value("深圳璨宇贸易有限公司"))
                .andDo(print());
    }

    @Test
    public void wrongTokenShouldReturnSuccessMessage() throws Exception {
        this.mockMvc.perform(post("/commercial-info")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"token\":\"my-wrong-token\"}")
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(content().contentType("application/json;charset=utf-8"))
                .andExpect(jsonPath("$.code").value("201"))
                .andDo(print());
    }

}
