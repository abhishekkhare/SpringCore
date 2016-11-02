package com.edu.abhi.datehandler;

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
			DateBO date = (DateBO)context.getBean("datebo");
	    	System.out.println(date);	
		}
		
		{
			DateBO date = (DateBO)context.getBean("dateboc");
	    	System.out.println(date);	
		}

	}
}
