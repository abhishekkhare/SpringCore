package com.edu.abhi.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmployeeAfterAspect {

	@After("args(name)")
	public void logStringArguments(String name) {
		System.out.println("Running After Advice. String argument passed=" + name + " " + this.getClass());
	}

	@AfterThrowing("within(com.edu.abhi.aop.aspectj.Employee)")
	public void logExceptions(JoinPoint joinPoint) {
		System.out.println("Exception thrown in Employee Method=" + joinPoint.toString() + " " + this.getClass());
	}

	@AfterReturning(pointcut = "execution(* getName())", returning = "returnString")
	public void getNameReturningAdvice(String returnString) {
		System.out.println("getNameReturningAdvice executed. Returned String=" + returnString + " " + this.getClass());
	}

}
