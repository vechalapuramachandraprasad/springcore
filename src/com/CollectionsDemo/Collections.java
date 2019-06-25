package com.CollectionsDemo;

import java.util.*;

public class Collections {
	List addressList;
	Set addressSet;
	Map addressMap;
	Properties addressProp;
	
	public void setAddressList(List addrList){
		this.addressList = addrList;
	}
	public List getAddressList(){
		System.out.println("list elements : "+ this.addressList);
		return this.addressList;
	}
	
	public void setAddressSet(Set addrSet){
		this.addressSet = addrSet;		
	}
	public Set getAddressSet(){
		System.out.println("Set elements : "+ this.addressSet);
		return this.addressSet;
	}
	
	public void setAddressMap(Map addrMap){
		this.addressMap = addrMap;
	}
	public Map getAddressMap(){
		System.out.println("Map elements : "+ this.addressMap);
		return this.addressMap;
	}
	
	public void setAddressProp(Properties addrProp){
		this.addressProp = addrProp;
	}
	public Properties getAddressProp(){
		System.out.println("Property elements : "+ this.addressProp);
		return this.addressProp;
	}
	
}
