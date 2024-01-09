package com.example.spring_autoconfig;

import com.example.spring_autoconfig.interfaces.Mobile;
import com.example.spring_autoconfig.interfaces.Processor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.spring_autoconfig")
public class AppConfig {

//    @Bean
//    public Samsung getMobile(){
//        return new Samsung();
//    }
//    @Bean
//    public Processor getProcessor(){
//        return new Snapdragon();
//    }
}
