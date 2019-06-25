package com.LazyInitDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyInitTest {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("LazyInit.xml");
		context.getBean("objB");
	}
}
