package com.bridgIt.springPrax.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Students.xml");
		Student student=(Student)context.getBean("student");
		System.out.println(student);
		((AbstractApplicationContext) context).close();
		
	}

}
