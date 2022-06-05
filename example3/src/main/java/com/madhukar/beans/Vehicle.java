package com.madhukar.beans;

public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle instantiated...");
    }

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
