package com.madhukar.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Lazy
public class Person {

    public Person(){
        System.out.println("Person instantiated...");
    }

    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

}