package com.springcore.springcore.eliminationComponent;

import org.springframework.beans.factory.annotation.Value;

public class Samosa {
	@Value("100")
	private int Price;
	
	public void display() {
		System.out.println(this.Price);
	}
	
}
