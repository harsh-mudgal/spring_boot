package com.example.spring_autoconfig;

import com.example.spring_autoconfig.interfaces.Mobile;
import com.example.spring_autoconfig.interfaces.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("mySamsung")
public class Samsung implements Mobile {
    @Autowired
    private Processor processor;
    public Processor getProcessor(){
        return processor;
    }
    public void setProcessor(Processor p){
        this.processor=p;
    }

    void print(){
        System.out.println("Inside Samsung");
        System.out.println(processor);
    }

}
