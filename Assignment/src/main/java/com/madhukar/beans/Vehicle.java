package com.madhukar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private VehicleService vehicleservice;

    @Autowired
    public Vehicle(VehicleService vehicleservice){
        System.out.println("Vehicle instantiated...");
        this.vehicleservice = vehicleservice;
    }

    private String name = "Toyota";
    public String getName(){
        return name;
    }

    public void playMusic(){
        vehicleservice.playMusic();
    }

    public void move(){
        vehicleservice.startMoving();
    }
}
