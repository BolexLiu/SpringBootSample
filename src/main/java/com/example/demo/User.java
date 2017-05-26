package com.example.demo;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Created by liushenen on 2017/5/24.
 */
public class User {
    @JsonView(VIew.NameAndId.class)
    private  String name;
    @JsonView(VIew.NameAndId.class)
    private String id;
    private String pwd;

    public User(String name, String id, String pwd) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
