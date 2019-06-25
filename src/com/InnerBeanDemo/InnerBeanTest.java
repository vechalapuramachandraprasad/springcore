package com.InnerBeanDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InnerBeanTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("InnerBean.xml");
		TextEditor obj = (TextEditor)context.getBean("textEditObj");
		obj.spellCheck();

	}

}
