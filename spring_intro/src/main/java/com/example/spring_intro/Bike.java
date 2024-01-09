package com.example.spring_intro;

import com.example.spring_intro.interfaces.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike available");
    }
}
