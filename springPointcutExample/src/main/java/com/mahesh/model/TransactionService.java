package com.mahesh.model;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class TransactionService {

	@Pointcut("execution(* com.mahesh.*.Circle.get*(..))")
	public void myPointCut() {
	}

	@Before("myPointCut()")
	public void beforeMethod() {
		System.out.println("Firstly I am Boss Here i run first.");
	}

}
