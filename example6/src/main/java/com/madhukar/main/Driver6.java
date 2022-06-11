package com.madhukar.main;

import com.madhukar.beans.Person;
import com.madhukar.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver6 {
    public static void main(String args[]){
        System.out.println("Singleton Bean Scope");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Person person1 = context.getBean(Person.class);
        Person person2 = context.getBean(Person.class);

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
