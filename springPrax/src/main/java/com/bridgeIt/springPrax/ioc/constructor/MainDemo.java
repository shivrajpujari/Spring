package com.bridgeIt.springPrax.ioc.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("carEngine.xml");
		Car car=(Car)context.getBean("car"); 
		car.work();
		((AbstractApplicationContext) context).close();
		
	}
}
