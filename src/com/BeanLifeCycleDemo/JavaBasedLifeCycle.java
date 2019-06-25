package com.BeanLifeCycleDemo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class JavaBasedLifeCycle implements InitializingBean, DisposableBean{

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("java based init method is called");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("java based destroy method is called");	
	}
	
	
	
}
