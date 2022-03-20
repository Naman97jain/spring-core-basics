package com.springcore.springcore.eliminatingXML;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee e1 = context.getBean("employee", Employee.class);
		System.out.println(e1.getName());		
		System.out.println(e1);
		Employee e2 = context.getBean("employee", Employee.class);
		System.out.println(e2);
		context.close();
	}
}
