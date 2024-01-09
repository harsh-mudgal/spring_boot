package com.example.spring_autoconfig;

import com.example.spring_autoconfig.interfaces.Processor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Snapdragon implements Processor {

    @Override
    public String toString(){
        return "Snapdragon";
    }
}
