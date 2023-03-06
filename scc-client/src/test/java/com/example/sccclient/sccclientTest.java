package com.example.sccclient;

import org.assertj.core.api.BDDAssertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.MOCK)
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
@AutoConfigureStubRunner(ids={"com.example:Learning-SCC:+:stubs:8080"} ,stubsMode = StubRunnerProperties.StubsMode.LOCAL)
class sccclientTest {

    @Autowired
    private sccclient sccclientrepo;


    @Autowired
    private MockMvc mockMvc;

    @Test
    public void clientTest() throws Exception{

//        mockMvc.perform(MockMvcRequestBuilders.get("/getData")
//                .contentType(MediaType.APPLICATION_JSON))
//                .andExpect(status().isOk());

        Collection<sccModel> getdata=this.sccclientrepo.getData();
        BDDAssertions.then(getdata).size().isEqualTo(2);
        BDDAssertions.then(getdata.iterator().next().getId()).isEqualTo(1);
        BDDAssertions.then(getdata.iterator().next().getNamename()).endsWith("mahadeva");
    }

}