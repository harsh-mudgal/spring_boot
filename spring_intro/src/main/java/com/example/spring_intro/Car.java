package com.example.spring_intro;

import com.example.spring_intro.interfaces.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Autowired
    Tyre tyre;
    @Override
    public void drive() {
        System.out.println("Car available");
        System.out.println(tyre);
    }
}
