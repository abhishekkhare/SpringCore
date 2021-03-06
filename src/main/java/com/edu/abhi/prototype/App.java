package com.edu.abhi.prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.abhi.singleton.CustomerService;

/**
 * 
 * @author abhishekkhare
 *
 */

public class App {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

	public static void main(String[] args) {
		CustomerService custA = (CustomerService) context.getBean("customerServiceP");
		custA.setMessage("Message by custA");
		System.out.println("Message : " + custA.getMessage());

		// retrieve it again
		CustomerService custB = (CustomerService) context.getBean("customerServiceP");
		System.out.println("Message : " + custB.getMessage());

	}
}
