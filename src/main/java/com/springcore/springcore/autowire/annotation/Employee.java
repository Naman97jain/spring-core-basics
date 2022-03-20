package com.springcore.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	private Address address;

	public Address getAddress() {
		return this.address;
	}
	
	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		System.out.println("Setting address");
		this.address = address;
	}
	
	public Employee(Address address) {
		System.out.println("in constructor");
		this.address = address;
	}
	
	public Employee() {
		
	}
	
	public String toString() {
		return "" + this.address;
	}

}
