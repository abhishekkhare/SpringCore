package com.edu.abhi.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
	public static void main(String[] args) {

		{
			CustomerService cust = (CustomerService) context.getBean("customerServiceProxy");

			System.out.println("*************************");
			cust.printName();
			System.out.println("*************************");
			cust.printURL();
			System.out.println("*************************");
			try {
				cust.printThrowException();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		System.out.println("111111111111111111111111111111111111111111111111111111111111111111111111111111111111111");
		{
			CustomerService cust = (CustomerService) context.getBean("customerServiceProxyAOP");

			System.out.println("*************************");
			cust.printName();
			System.out.println("*************************");
			cust.printURL();
			System.out.println("*************************");
			try {
				cust.printThrowException();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		System.out.println("22222222222222222222222222222222222222222222222222222222222222222222222222");
		{
			CustomerService cust = (CustomerService) context.getBean("customerServiceProxyPointCut");

			System.out.println("*************************");
			cust.printName();
			System.out.println("*************************");
			cust.printURL();
			System.out.println("*************************");
			try {
				cust.printThrowException();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
	}
}