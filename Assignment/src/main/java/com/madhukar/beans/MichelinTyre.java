package com.madhukar.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichelinTyre implements Tyre{
    @Override
    public void startRotating() {
        System.out.println("MichelinTyres started rotating");
    }
}
