package com.kkhindigyan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootProfileAnnotationExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootProfileAnnotationExampleApplication.class, args);
		
		Object bean = applicationContext.getBean("myProp");
		String myProp =(String) bean;
		System.out.println(myProp);
	}
}
