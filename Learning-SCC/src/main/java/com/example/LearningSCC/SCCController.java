package com.example.LearningSCC;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SCCController {



    @Autowired
    private sccjparepo sccjparepo;

    @GetMapping("/getsccData")
    public List<scctestingmodel> getsccdata(){
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");
        System.out.println("Testing");

        return sccjparepo.findAll();
    }





}
