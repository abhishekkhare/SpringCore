package com.edu.abhi.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MapFactoryBeanApp {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

	public static void main(String[] args) {
		{
			Customer cust = (Customer) context.getBean("CustomerBeanM");
			System.out.println(cust);
		}
		

	}
}
