package com.example.LearningSCC;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class scctestingmodel {

    @Id
    public Integer id;

    public String namename;

    public scctestingmodel(Integer id, String name) {
        this.id = id;
        this.namename = name;
    }

    public scctestingmodel() {
    }

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
