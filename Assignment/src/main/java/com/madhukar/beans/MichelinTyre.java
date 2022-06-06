package com.madhukar.beans;

import org.springframework.stereotype.Component;

@Component("MichelinTyre")
public class MichelinTyre implements Tyre{
    @Override
    public void startRotating() {
        System.out.println("MichelinTyres started rotating");
    }
}
