package com.fnp.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fnp.dto.Employee;


/**
 * @author Saransh vijay
 * The Class ConstructorInjectionApplication.
 */
public class ConstructorInjectionApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
	  ApplicationContext context = new ClassPathXmlApplicationContext("/com/fnp/constructor_injection/config.xml");
	  
	  Employee emp = (Employee) context.getBean("emp");
	  System.out.println(emp);
	}

}
