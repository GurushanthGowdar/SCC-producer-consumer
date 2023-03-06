package com.example.sccclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

@Repository
@RestController
public class sccclient {






    @Autowired
    private RestTemplate restTemplate;

//    @GetMapping("/calculate")
//    public Collection<sccModel> checkOddAndEven(@RequestParam("number") Integer number) {
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.add("Content-Type", "application/json");
//        ParameterizedTypeReference<Collection<sccModel>> ptr=new ParameterizedTypeReference<Collection<sccModel>>(){};
//        ResponseEntity<Collection<sccModel>> responseEntity = restTemplate.exchange(
//                "http://localhost:8080/getsccData",
//                HttpMethod.GET,
//                new HttpEntity<>(httpHeaders),
//                ptr
//                );
//
//        return responseEntity.getBody();
//    }



    @GetMapping("/Testing")
    public String getTestingData(){
        return "Connected";
    }


    @GetMapping("/getData")
    public Collection<sccModel> getData(){
        ParameterizedTypeReference<Collection<sccModel>> ptr=new ParameterizedTypeReference<Collection<sccModel>>(){};
        ResponseEntity<Collection<sccModel>> exchange = restTemplate.exchange("http://localhost:8080/getsccData", HttpMethod.GET, null, ptr);
        return exchange.getBody();
    }






    public sccclient() {

    }



}
