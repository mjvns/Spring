package com.madhukar.beans;

import org.springframework.stereotype.Component;

@Component
public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle instantiated...");
    }

    private String name = "Toyota";

    public String getName(){
        return name;
    }
}
