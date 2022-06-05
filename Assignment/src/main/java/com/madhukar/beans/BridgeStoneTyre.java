package com.madhukar.beans;

import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyre implements Tyre{
    @Override
    public void startRotating() {
        System.out.println("Bridge Stone tyres start rotating");
    }
}
