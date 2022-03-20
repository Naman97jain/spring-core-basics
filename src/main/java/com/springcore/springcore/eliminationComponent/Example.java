package com.springcore.springcore.eliminationComponent;

import org.springframework.beans.factory.annotation.Autowired;

public class Example {
	@Autowired
	private Samosa samosa;
	
	public void exampleDisplay() {
		System.out.println("Samosa in example: " + this.samosa);
		System.out.println("Example containing samosa");
	}

	public Samosa getSamosa() {
		return this.samosa;
	}
}
