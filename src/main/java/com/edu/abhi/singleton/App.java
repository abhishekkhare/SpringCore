package com.edu.abhi.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author abhishekkhare
 *
 */

public class App {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

	public static void main(String[] args) {
		CustomerService custA = (CustomerService) context.getBean("customerService");
		custA.setMessage("Message by custA");
		System.out.println("Message : " + custA.getMessage());

		// retrieve it again
		CustomerService custB = (CustomerService) context.getBean("customerService");
		System.out.println("Message : " + custB.getMessage());

	}
}
