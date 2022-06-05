package com.madhukar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    public Person(Vehicle vehicle){
        System.out.println("Person instantiated...");
        this.vehicle = vehicle;
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

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

}