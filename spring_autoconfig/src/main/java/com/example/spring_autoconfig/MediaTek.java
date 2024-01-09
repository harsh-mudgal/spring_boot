package com.example.spring_autoconfig;

import com.example.spring_autoconfig.interfaces.Processor;
import org.springframework.stereotype.Component;

@Component
public class MediaTek implements Processor {

    @Override
    public String toString(){
        return "MediaTek";
    }
}
