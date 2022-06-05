package com.madhukar.main;

import com.madhukar.beans.Person;
import com.madhukar.beans.Vehicle;
import com.madhukar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RunProgram {
    public static void main(String args[]){
        System.out.println("Solution to Bean wiring assignment");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person name is "+ person.getName());
        System.out.println("Person has vehicle "+ person.getVehicle().getName());
        System.out.println("Vehicle name is "+ person.getVehicle().getName());
        person.getVehicle().playMusic();
        person.getVehicle().move();
    }
}
