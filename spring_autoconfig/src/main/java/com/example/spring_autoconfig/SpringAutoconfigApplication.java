package com.example.spring_autoconfig;

import com.example.spring_autoconfig.interfaces.Mobile;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class SpringAutoconfigApplication {

	public static void main(String[] args) {

		//SpringApplication.run(SpringAutoconfigApplication.class, args);
		ApplicationContext factory= new AnnotationConfigApplicationContext(AppConfig.class);

		Samsung mob=factory.getBean(Samsung.class);
		mob.print();


	}

}
