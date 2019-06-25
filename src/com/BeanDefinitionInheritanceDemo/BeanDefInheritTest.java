package com.BeanDefinitionInheritanceDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanDefInheritTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("BeanDefInheritance.xml");
	      
	      HelloIndia objB = (HelloIndia) context.getBean("HelloIndia");
	      objB.getMessage1();
	      objB.getMessage2();
	      objB.getMessage3();

	}

}
