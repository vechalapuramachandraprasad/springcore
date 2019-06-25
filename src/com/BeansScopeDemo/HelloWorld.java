package com.BeansScopeDemo;

public class HelloWorld {
	private String message;
	public void setMsg(String msg){
		this.message = msg;
	}
	public void getMsg(){
		System.out.println("ur msg "+ this.message);		
	}
}
