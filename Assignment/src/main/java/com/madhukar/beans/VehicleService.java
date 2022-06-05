package com.madhukar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {

    private Speaker speaker;
    private Tyre tyre;

    public VehicleService(Speaker speaker,Tyre tyre){
        System.out.println("Vehicle service initialized");
        this.speaker = speaker;
        this.tyre = tyre;
    }

    public void playMusic(){
        speaker.startPlaying();
    }

    public void startMoving(){
        tyre.startRotating();
    }
}
