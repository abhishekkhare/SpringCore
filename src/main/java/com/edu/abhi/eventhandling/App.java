package com.edu.abhi.eventhandling;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.abhi.beanpostprocessor.HelloWorld;

public class App {
	private static ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	public static void main(String[] args) {
		// Let us raise a start event.
	      context.start();
	      context.refresh();
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
		// Let us raise a stop event.
	      context.stop();
	      context.close();
	}
}
