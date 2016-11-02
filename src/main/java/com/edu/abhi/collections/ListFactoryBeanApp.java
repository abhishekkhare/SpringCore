package com.edu.abhi.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ListFactoryBeanApp {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

	public static void main(String[] args) {
		{
			Customer cust = (Customer) context.getBean("CustomerBeanL");
			System.out.println(cust);
		}
		

	}
}
