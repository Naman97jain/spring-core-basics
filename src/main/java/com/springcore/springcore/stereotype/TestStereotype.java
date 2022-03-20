package com.springcore.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotype {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springcore/stereotype/configStandAloneColl.xml");
		Person p1 = context.getBean("person", Person.class);
		
		System.out.println(p1.getName());
		System.out.println(p1.getName().getClass().getName());
		System.out.println("---------------------------------------");
		System.out.println(p1.getCity());
		System.out.println(p1.getCity().getClass().getName());
		System.out.println("---------------------------------------");
		System.out.println(p1.getAddresses());
		System.out.println(p1.getAddresses().getClass().getName());
		System.out.println("---------------------------------------");
		
		((ConfigurableApplicationContext) context).close();
	
	}
}
