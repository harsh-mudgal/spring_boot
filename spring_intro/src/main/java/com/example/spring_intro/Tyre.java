package com.example.spring_intro;

import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class Tyre {
    String brand;
//    public Tyre(String s){
//        this.brand=s;
//    }
    String getTyre(){
        return brand;
    }
    void setTyre(String s){
        this.brand=s;
    }
    @Override
    public String toString(){
        return "In tyre...." + brand;
    }
}
