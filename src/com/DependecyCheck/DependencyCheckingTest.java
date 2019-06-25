package com.DependecyCheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyCheckingTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("DependencyCheck.xml");
		 Customer obj = (Customer)context.getBean("Customerobj");
		 obj.dispaly();
	}

}
