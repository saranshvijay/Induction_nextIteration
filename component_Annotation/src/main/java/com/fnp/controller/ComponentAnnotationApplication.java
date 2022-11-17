package com.fnp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fnp.dto.Student;

public class ComponentAnnotationApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		
		Student student = context.getBean("set",Student.class);
		System.out.println(student);
	}

}
