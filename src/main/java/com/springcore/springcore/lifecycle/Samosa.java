package com.springcore.springcore.lifecycle;


public class Samosa {
	private double price;
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public String toString() {
		return "" + this.price;
	}
	
	public void init() {
		System.out.println("Inside init method of Samosa");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method samosa");
	}
	
}
