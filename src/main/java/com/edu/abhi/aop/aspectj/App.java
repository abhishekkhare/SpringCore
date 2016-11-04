package com.edu.abhi.aop.aspectj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringAspectJ.xml");
	public static void main(String[] args) {
		EmployeeService employeeService = context.getBean("employeeService", EmployeeService.class);

		System.out.println(employeeService.getEmployee().getName());

		employeeService.getEmployee().setName("Abhishek Khare");

		employeeService.getEmployee().throwException();

		context.close();
	}
}
