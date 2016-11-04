package com.edu.abhi.eventhandling.custom;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	public static void main(String[] args) {
		CustomEventPublisher cvp = (CustomEventPublisher) context.getBean("customEventPublisher");
		cvp.publish();
		cvp.publish();
	}
}
