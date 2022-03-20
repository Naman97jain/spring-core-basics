package com.springcore.springcore.autowire;

public class Address {
	private String street;
	private String city;
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public String getCity() {
		return this.city;
	}
	
	public String toString() {
		return this.street + this.city;
	}
}
