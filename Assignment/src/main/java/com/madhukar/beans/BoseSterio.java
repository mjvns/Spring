package com.madhukar.beans;

import org.springframework.stereotype.Component;

@Component("BoseSterio")
public class BoseSterio implements Speaker{
    @Override
    public void startPlaying() {
        System.out.println("BoseSterio started playing...");
    }
}
