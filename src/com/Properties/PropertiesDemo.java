package com.Properties;

public class PropertiesDemo {
	private String appName;
	private String StuName;
	private String StuSection;
	private int Marks;
	
	public PropertiesDemo(String StuName, String StuSection, int Marks){
		this.StuName = StuName;
		this.StuSection = StuSection;
		this.Marks = Marks;
	}
	
	public void setappName(String appName){
		this.appName = appName;
	}
	public String getappName(){
		return this.appName;
	}
	
	@Override
	public String toString(){
		return "Student name is : " + this.StuName + " Student section is : "+ this.StuSection +" Marks are : "+ this.Marks;
	}
}
