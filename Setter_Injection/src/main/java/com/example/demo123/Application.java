package com.example.demo123;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.dto.Employee;

/**
 * @author Saransh vijay
 * The Class Application.
 */
public class Application {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("/com/example/demo123/context.xml");
		System.out.println("js");
		Employee emp = (Employee) context.getBean("emp");
		Employee emp1 = (Employee) context.getBean("emp2");
		System.out.println(emp +"\n"+ emp1);
	}
}
