package com.springcore.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public String getSubject() {
		return "" + this.subject;
	}
	
	public String toString() {
		return this.getSubject();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Init method of Example POJO");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method of Example POJO");
	}
}
