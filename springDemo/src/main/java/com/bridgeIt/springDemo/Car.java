package com.bridgeIt.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Car {

	Engine engine;
	private String name;
	
	public void start() {
		engine.ready();
		System.out.println("car is running");
	}
	
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("engine.xml");
		Car car=(Car)context.getBean("car");
		car.start();
	}
}
