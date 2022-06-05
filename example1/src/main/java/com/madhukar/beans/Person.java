package com.madhukar.beans;

public class Person {
    private String name;
    private Vehicle vehicle;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setVehicle(){
        vehicle = new Vehicle();
        vehicle.setName("Honda");
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

}
