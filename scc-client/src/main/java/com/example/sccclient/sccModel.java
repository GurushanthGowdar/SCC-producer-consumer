package com.example.sccclient;

import org.springframework.stereotype.Component;

@Component
public class sccModel {

    public Integer id;
    public String namename;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamename() {
        return namename;
    }

    public void setNamename(String namename) {
        this.namename = namename;
    }

}
