package com.madhukar.beans;

public class Person {

    public Person(){
        System.out.println("Person instantiated...");
    }

    private String name;
    private Vehicle vehicle;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setVehicle(Vehicle vehicle){
        this.vehicle = vehicle;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

}
