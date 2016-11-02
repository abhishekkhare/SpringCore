package com.edu.abhi.expressionlanguage.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {
	public static void main(String [] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		{
			Customer obj = (Customer) context.getBean("CustomerBeanEL");
		    System.out.println(obj);	
		}
	    
	    
	    {
			Operators obj = (Operators) context.getBean("operatorBeanEL");
		    System.out.println(obj);	
		}
	    
	    {
	    	Collections obj = (Collections) context.getBean("collectionsBeanEL");
		    System.out.println(obj);	
		}
	}
}
