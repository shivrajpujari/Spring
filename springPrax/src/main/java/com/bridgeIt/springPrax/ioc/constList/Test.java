package com.bridgeIt.springPrax.ioc.constList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("collection.xml");
			Teacher teacher=(Teacher)context.getBean("teacher");
			teacher.displayInfo();
			((AbstractApplicationContext) context).close();
		}
}
