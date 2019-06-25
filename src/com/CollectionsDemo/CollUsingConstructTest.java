package com.CollectionsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollUsingConstructTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("CollUsingConstructor.xml");
		CollUsingConstructor obj = (CollUsingConstructor)context.getBean("collConstructObj");
		obj.displayInfo();

	}

}
