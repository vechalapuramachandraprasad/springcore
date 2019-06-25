package com.AutowireDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AutoWire.xml");
		ClassA obj1 = (ClassA)context.getBean("objA", ClassA.class);
		obj1.display();
	}

}
