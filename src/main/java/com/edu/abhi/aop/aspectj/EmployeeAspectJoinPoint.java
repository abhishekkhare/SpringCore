package com.edu.abhi.aop.aspectj;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeAspectJoinPoint {

	@Before("execution(public void com.edu.abhi.aop.aspectj..set*(*))")
	public void loggingAdvice(JoinPoint joinPoint) {
		System.out.println("Before running loggingAdvice on method=" + joinPoint.toString() + " " + this.getClass());

		System.out.println("Agruments Passed=" + Arrays.toString(joinPoint.getArgs()) + " " + this.getClass());

	}

	// Advice arguments, will be applied to bean methods with single String
	// argument
	@Before("args(name)")
	public void logStringArguments(String name) {
		System.out.println("String argument passed=" + name + " " + this.getClass());
	}
}