package com.madhukar.main;

import com.madhukar.beans.Person;
import com.madhukar.beans.Vehicle;
import com.madhukar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver2 {
    public static void main(String args[]){
        System.out.println("Wiring beans using method call()");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        Person person = context.getBean(Person.class);

        System.out.println("Person name is "+ person.getName());
        System.out.println("Person has vehicle "+ person.getVehicle().getName());
        System.out.println("Vehicle name is "+ vehicle.getName());
    }
}
