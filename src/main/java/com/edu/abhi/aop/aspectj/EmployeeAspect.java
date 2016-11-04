package com.edu.abhi.aop.aspectj;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


@Aspect
public class EmployeeAspect {

	@Before("execution(public String getName())")
	public void getNameAdvice(){
		System.out.println("Executing Advice on getName()" + " " + this.getClass());
	}
	
	@Before("execution(* com.edu.abhi.aop.aspectj.*.get*())")
	public void getAllAdvice(){
		System.out.println("Service method getter called" + " " + this.getClass());
	}
}
