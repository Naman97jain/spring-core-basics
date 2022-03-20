package com.springcore.springcore.collections;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;

public class Employee {
	private String name;
	private List<String> phone;
	private Set<String> addresses;
	private Map<String, Float> courses;
	private Properties prop;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setProps(Properties prop) {
		this.prop = prop;
	}
	
	public Properties getProps() {
		return this.prop;
	}
//	
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	
	public void setCourses(Map<String, Float> courses) {
		this.courses = courses;
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<String> getPhones(){
		return this.phone;
	}
	
	public Set<String> getAddresses(){
		return this.addresses;
	}
	
	public Map<String, Float> getCourses(){
		return this.courses;
	}
}
