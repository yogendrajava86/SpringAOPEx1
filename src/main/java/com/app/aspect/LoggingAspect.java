package com.app.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

	@Pointcut("execution(public * com.app..*.get*(..))")
	public void p1() {}
	
	@Before("p1()")
	public void show() {
		System.out.println("from advice");
	}
	@After("execution(public * com.app..*.get*(..))")
	public void getdt() {
		System.out.println("from after-advice");
	}
	
}
