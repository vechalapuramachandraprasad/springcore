package com.AutowireDemo;

public class ClassA {
	private ClassB objB;
	public ClassA(ClassB objB){
		System.out.println("ClassA object is created");
		this.objB = objB;
	}
	public ClassB getObjB(){
		return this.objB;
	}
	public void setObjB(ClassB objB){
		this.objB = objB;
	}
	
	public void print(){
		System.out.println("Hello from ClassA");
	}
	public void display(){
		this.print();
		objB.print();
	}
}
