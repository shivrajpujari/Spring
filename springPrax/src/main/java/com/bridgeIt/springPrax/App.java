package com.bridgeIt.springPrax;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bridgeIt.springPrax.lifeCycle.Bean;

public class App 
{
    public static void main( String[] args )
    {
        
    	//AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle.xml");
    	ApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle.xml");	
    	Bean bean1=(Bean)context.getBean("bean1");
    		bean1.getMessage();
    	//	context.registerShutdownHook();
    		((AbstractApplicationContext) context).close();
    		
    		
    }
}
