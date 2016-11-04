package com.edu.abhi.aop.aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointcut {

	@Before("getNamePointcut()")
	public void loggingAdvice() {
		System.out.println("Executing loggingAdvice on getName()" + " " + this.getClass());
	}

	@Before("getNamePointcut()")
	public void secondAdvice() {
		System.out.println("Executing secondAdvice on getName()" + " " + this.getClass());
	}

	@Pointcut("execution(public String getName())")
	public void getNamePointcut() {
	}

	@Before("allMethodsPointcut()")
	public void allServiceMethodsAdvice() {
		System.out.println("Before executing service method" + " " + this.getClass());
	}

	// Pointcut to execute on all the methods of classes in a package
	@Pointcut("within(com.edu.abhi.aop.aspectj.*)")
	public void allMethodsPointcut() {
	}

}
