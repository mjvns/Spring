package com.madhukar.main;

import com.madhukar.beans.Person;
import com.madhukar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver7 {
    public static void main(String args[]){
        System.out.println("Lazy Initialization");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        System.out.println("Bean not created");
        Person person = context.getBean(Person.class);
        System.out.println("Bean created on lazy initialization");
    }
}
