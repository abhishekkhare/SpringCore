package com.edu.abhi.autowire;

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
		// No Autowire
		{
			CustomerN cust = (CustomerN) context.getBean("customerAutowireN");
			System.out.println(cust);
		}
		// Autowire Name
		{
			CustomerN cust = (CustomerN) context.getBean("customerN");
			System.out.println(cust);
		}
		// Autowire Type
		{
			CustomerT cust = (CustomerT) context.getBean("customerT");
			System.out.println(cust);
		}
		// Autowire Constructor
		{
			CustomerC cust = (CustomerC) context.getBean("customerC");
			System.out.println(cust);
		}

		// Autowire
		{
			CustomerA cust = (CustomerA) context.getBean("CustomerA");
			System.out.println(cust);
		}

		// Autowire
		{
			CustomerAS cust = (CustomerAS) context.getBean("CustomerAS");
			System.out.println(cust);
		}

		// Autowire
		{
			CustomerCS cust = (CustomerCS) context.getBean("CustomerCS");
			System.out.println(cust);
		}
		{
			CustomerAQ cust = (CustomerAQ) context.getBean("CustomerAQ");
			System.out.println(cust);
		}
	}
}
