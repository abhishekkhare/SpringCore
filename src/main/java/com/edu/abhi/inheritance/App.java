package com.edu.abhi.inheritance;

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
			Country country = (Country)context.getBean("CountryBean");
	    	System.out.println(country);	
		}
		{
			Country country = (Country)context.getBean("CountryBean1");
	    	System.out.println(country);	
		}
		
		{
			Country country = (Country)context.getBean("CountryBean2");
	    	System.out.println(country);	
		}
		
		{
			Country country = (Country)context.getBean("CountryBean3");
	    	System.out.println(country);	
		}

	}
}
