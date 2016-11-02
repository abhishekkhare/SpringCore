package com.edu.abhi.expressionlanguage.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		{
			Customer obj = (Customer) context.getBean("customerBean");
			System.out.println(obj);
		}
		{
			Operators obj = (Operators) context.getBean("operatorBean");
			System.out.println(obj);
		}
		{
			Collections obj = (Collections) context.getBean("collectionBean");
			System.out.println(obj);
		}

	}
}
