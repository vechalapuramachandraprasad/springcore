package com.CollectionsDemo;

import java.util.*;
import java.util.Map.Entry;

public class CollUsingConstructor {
	private int id;  
	private String name;  
	private List<String> cities;  
	private Set<String> countries;   
	private Map<String,String> districts;
	
	public CollUsingConstructor(int id, String name, List<String> cities,Set<String> countries, Map<String,String> districts) {  
	    this.id = id;  
	    this.name = name;  
	    this.cities = cities;  
	    this.countries = countries;
	    this.districts = districts;	    
	}  
	public void displayInfo(){
		System.out.println(this.id +" "+ this.name);
		System.out.println("List values are : ");
		Iterator itr = this.cities.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		System.out.println("Set values are : ");
		Iterator itr1 = this.countries.iterator();
		while(itr1.hasNext()){
			System.out.println(itr1.next());
		}
		System.out.println("Map values are : ");
		Set<Entry<String,String>> set = this.districts.entrySet();
		Iterator<Entry<String,String>> itr3 = set.iterator();
		while(itr3.hasNext()){
			Entry<String, String> entry = itr3.next();
			System.out.println("District : "+ entry.getKey()+ " : " + entry.getValue());
		}
	}
}
