package com.edu.abhi.collections;

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
		{
			Customer cust = (Customer) context.getBean("CustomerBeanCollection");
			System.out.println(cust);
		}
		

	}
}
