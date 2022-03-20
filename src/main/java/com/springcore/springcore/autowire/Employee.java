package com.springcore.springcore.autowire;

public class Employee {
	private Address address;

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		System.out.println("Setting address");
		this.address = address;
	}
	
	public Employee(Address address) {
		this.address = address;
	}
	
	public Employee() {
		
	}
	
	public String toString() {
		return "" + this.address;
	}

}
