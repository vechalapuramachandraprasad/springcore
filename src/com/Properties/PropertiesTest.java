package com.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertiesTest {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("Properties.xml");
		PropertiesDemo obj = (PropertiesDemo)context.getBean("obj");
		System.out.println(obj.getappName());
		System.out.println(obj.toString());

	}

}
