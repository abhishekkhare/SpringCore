package com.edu.abhi.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetFactoryBeanApp {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

	public static void main(String[] args) {
		{
			Customer cust = (Customer) context.getBean("CustomerBeanS");
			System.out.println(cust);
		}
		

	}
}
