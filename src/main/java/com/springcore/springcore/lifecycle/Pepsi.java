package com.springcore.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Pepsi implements InitializingBean, DisposableBean{
	private double price;
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double price() {
		return this.price;
	}
	
	public String toString() {
		return "" + this.price;
	}
	
	public void afterPropertiesSet() {
		System.out.println("In init method of Pepsi");
	}
	
	public void destroy() {
		System.out.println("In destroy method of Pepsi");
	}
	
}
