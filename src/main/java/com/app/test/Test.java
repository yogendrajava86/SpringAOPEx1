package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;
import com.app.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService serv=ac.getBean("employeeService",EmployeeService.class);
		serv.getData();
	}

}
