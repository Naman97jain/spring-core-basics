package com.springcore.springcore.stereotype;

import java.util.List;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("Deenanath Chauhan")
	private String name;
	
	@Value("Delhi")
	private String city;
	
	@Value("#{temp}")
	private List<String> addresses;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}
	
	public List<String> getAddresses() {
		return addresses;
	}
	
	
}
