package com.firstSpringPro;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {  
	   // Resource resource=new ClassPathResource("applicationContext.xml");  
	   // BeanFactory factory=new XmlBeanFactory(resource); 
	    
	    ApplicationContext context= new ClassPathXmlApplicationContext("appContext.xml");	      
	    Class1 student=(Class1)context.getBean("studentbean");  
	    student.displayInfo();  
	}  
}
