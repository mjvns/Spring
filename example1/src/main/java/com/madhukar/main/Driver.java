package com.madhukar.main;

import com.madhukar.beans.Person;
import com.madhukar.beans.Vehicle;
import com.madhukar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person name is "+ person.getName());
        System.out.println("Person has vehicle "+ person.getVehicle());
        System.out.println("Vehicle name is "+ vehicle.getName());
    }
}
