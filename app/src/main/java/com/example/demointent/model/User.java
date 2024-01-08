package com.example.demointent.model;

import java.io.Serializable;

public class User implements Serializable {
    private int yosh;
    private String name;
    public User(int id, String name){
        this.yosh=yosh;
        this.name=name;
    }
    public String toString(){
        return "Yosh :"+yosh+"\nIsm : "+name;
    }

}
