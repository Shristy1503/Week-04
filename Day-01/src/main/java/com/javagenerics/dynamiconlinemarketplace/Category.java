package com.javagenerics.dynamiconlinemarketplace;

public abstract class Category {
    private String name;
    //constructor
    public Category(String name){
        this.name = name;
    }

    //getter
    public String getName(){
        return name;
    }
}
