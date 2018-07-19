package com.bridgeIt.springDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      
    ApplicationContext context	= new ClassPathXmlApplicationContext("Beans.xml");
    Bean bean=(Bean)context.getBean("bean1");
    System.out.println(bean);
    System.out.println( bean.getMessage());
    
    }
}
