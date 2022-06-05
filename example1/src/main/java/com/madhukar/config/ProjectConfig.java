package com.madhukar.config;

import com.madhukar.beans.Person;
import com.madhukar.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Person person(){
        Person person = new Person();
        person.setName("Madhukar");
        return person;
    }

    @Bean
    public Vehicle vehicle(){
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Audi");
        return vehicle;
    }
}
