package com.fnp.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fnp.dto.Student;

public class Controller {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/fnp/controller/config.xml");
		Student student = (Student) context.getBean("student");
		
		System.out.println(student);
		
	}

}
