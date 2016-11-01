package com.edu.abhi.dependencyinjection.constructor;

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
		OutputHelper output = (OutputHelper)context.getBean("OutputHelperConstructor");
    	output.outputGenerator.generateOutput();

	}
}
