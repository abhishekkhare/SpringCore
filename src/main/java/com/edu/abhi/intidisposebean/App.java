package com.edu.abhi.intidisposebean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



/**
 * 
 * @author abhishekkhare
 *
 */

public class App {

	public static void main(String[] args) {
		{
			ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
			CustomerService cust = (CustomerService)context.getBean("customerServiceID");
			CustomerServiceB custb = (CustomerServiceB)context.getBean("customerServiceIDB");
			CustomerServicePost custpost = (CustomerServicePost)context.getBean("customerServicePost");
	    	System.out.println(cust);
	    	System.out.println(custb);
	    	System.out.println(custpost);
	    	context.close();	
		}
		
		

	}
}
