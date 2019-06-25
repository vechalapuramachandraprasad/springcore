package com.BeanLifeCycleDemo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleTest {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Lifecycle.xml");
		context.registerShutdownHook();
		LifeCycle obj = (LifeCycle)context.getBean("obj");
		System.out.println(obj.getName());
		
		
		LifeCycle obj1 = (LifeCycle)context.getBean("obj1");
		System.out.println(obj1.getName());
		
		LifeCycle obj2 = (LifeCycle)context.getBean("obj2");
		System.out.println(obj2.getName());

	}

}
