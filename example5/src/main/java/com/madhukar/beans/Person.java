package com.madhukar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    public Person(){
        System.out.println("Person instantiated...");
    }

    private String name = "Madhukar";

    private Vehicle vehicle;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

    @Autowired
    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

}