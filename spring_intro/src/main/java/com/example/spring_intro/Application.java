package com.example.spring_intro;

import com.example.spring_intro.interfaces.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

//		XML context based
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Vehicle obj= (Vehicle) context.getBean("car");
		System.out.println("Spring started");
		obj.drive();


	}

}
