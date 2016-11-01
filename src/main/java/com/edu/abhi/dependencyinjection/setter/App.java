package com.edu.abhi.dependencyinjection.setter;

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
		OutputHelper output = (OutputHelper)context.getBean("OutputHelperSetter");
    	output.outputGenerator.generateOutput();

	}
}
