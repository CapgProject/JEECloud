package com.cg.springcore.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.springcore.service.Employee;
public class MyMainApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext appcon = new ClassPathXmlApplicationContext("spring.xml");
		Employee data = (Employee) appcon.getBean("emp");
		data.getPro().setProjId(1001);
		data.getData();
	}

}
