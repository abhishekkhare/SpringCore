package com.edu.abhi.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAnnotationAspect {

	@Before("@annotation(com.edu.abhi.aop.aspectj.Loggable)")
	public void myAdvice(){
		System.out.println("Executing myAdvice!!");
	}
}
