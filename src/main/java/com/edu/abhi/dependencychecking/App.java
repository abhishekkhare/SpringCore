package com.edu.abhi.dependencychecking;

import org.springframework.beans.factory.BeanCreationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * 
 * @author abhishekkhare
 *
 */

public class App {

	public static void main(String[] args) {
		// Uncomment when trying to see how @Required fails
//		{
//			try{
//				ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
//				Customer country = (Customer)context.getBean("CustomerBeanN");
//		    	System.out.println(country);	
//			}catch(BeanCreationException e){
//				System.out.println(e.getMessage());
//				e.printStackTrace();
//			}
//				
//		}
		
		{
			try{
				ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
				Customer country = (Customer)context.getBean("CustomerBeanR");
		    	System.out.println(country);	
			}catch(BeanCreationException e){
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
				
		}

	}
}
