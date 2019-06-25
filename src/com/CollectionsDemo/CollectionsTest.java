package com.CollectionsDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionsTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Collection.xml");
		Collections obj = (Collections)context.getBean("collObj");
		obj.getAddressList();
		obj.getAddressSet();
		obj.getAddressMap();
		obj.getAddressProp();

	}

}
