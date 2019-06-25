package com.BeanPostProcessorDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanPostProcessor.xml");
		
		HelloWorld obj = (HelloWorld)context.getBean("obj") ;
		obj.getMessage();		
		context.registerShutdownHook();			
	}

}
