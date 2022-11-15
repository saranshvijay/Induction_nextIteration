package com.fnp.setter_Collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fnp.dto.Employee;



/**
 * @author Saransh vijay
 * The Class SetterCollectionsApplication.
 */
public class SetterCollectionsApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("/com/fnp/setter_Collections/config.xml");
		
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp);	
	}
	
}
