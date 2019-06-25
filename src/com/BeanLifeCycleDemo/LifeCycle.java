package com.BeanLifeCycleDemo;

public class LifeCycle {
	private String name;
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void Init(){
		System.out.println("Bean is going through init");
	}
	public LifeCycle(){
		System.out.println("constructor is called");
		System.out.println(this.name);
	}
	public void Destroy(){
		System.out.println("Bean will destroy now");
	}
}
