package com.DependsOn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependsOnTestClass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("DependsOn.xml");

	}

}
