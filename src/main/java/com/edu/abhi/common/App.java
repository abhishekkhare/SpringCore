package com.edu.abhi.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.abhi.output.OutputHelper;

/**
 * 
 * @author abhishekkhare
 *
 */

public class App {

	private static ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");

	public static void main(String[] args) {
		helloSpring2();
		helloSpring3();
		looselyCoupled();

	}

	private static void looselyCoupled() {
		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	output.generateOutput();
	}

	private static void helloSpring3() {
		HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();

	}

	private static void helloSpring2() {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("Spring-Module.xml");
		HelloWorld obj = (HelloWorld) context1.getBean("helloBean");
		obj.printHello();

	}
}
