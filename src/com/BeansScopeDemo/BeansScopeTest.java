package com.BeansScopeDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeansScopeTest {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansScope.xml");
		HelloWorld obj1 = (HelloWorld)context.getBean("obj");
		obj1.setMsg("Hello World");
		obj1.getMsg();
		
		HelloWorld obj2 = (HelloWorld)context.getBean("obj");
		obj2.getMsg();
		
	}
}
