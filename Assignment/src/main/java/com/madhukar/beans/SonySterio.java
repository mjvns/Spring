package com.madhukar.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySterio implements Speaker{
    @Override
    public void startPlaying() {
        System.out.println("Sony sterio started playing");
    }
}
