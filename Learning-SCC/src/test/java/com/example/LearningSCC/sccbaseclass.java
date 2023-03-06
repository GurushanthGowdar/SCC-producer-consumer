package com.example.LearningSCC;

import io.restassured.RestAssured;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

@SpringBootTest(classes = LearningSccApplication.class)
public class sccbaseclass {

    Logger logger=Logger.getLogger(sccbaseclass.class.getName());

    @Autowired
    private SCCController sccController;

    @MockBean
    private sccjparepo sccjparepo;

    @BeforeEach
    public void getSetup(){

//        RestAssuredMockMvc.standaloneSetup(sccController);
//
////        List<scctestingmodel> all = sccjparepo.findAll();
//
//
//
////        List<scctestingmodel> scctestingmodels = sccjparepo.findAll();
//        List<scctestingmodel> scctestingmodels = Arrays.asList(new scctestingmodel(1,"mahadeva"),new scctestingmodel(2,"shiva"));
//
//        scctestingmodels.stream().forEach((data)-> logger.info(data.namename));
//        Mockito.when(sccjparepo.findAll()).thenReturn(scctestingmodels);

        RestAssured.baseURI="http://localhost";
        RestAssured.port=8080;

    }


}
