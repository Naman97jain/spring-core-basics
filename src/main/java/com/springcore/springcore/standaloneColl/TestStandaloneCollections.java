package com.springcore.springcore.standaloneColl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollections {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springcore/standaloneColl/configStandAloneColl.xml");
		Person p1 = context.getBean("p1", Person.class);
		System.out.println(p1.getFriends());
		System.out.println(p1.getFriends().getClass().getName());
		System.out.println("---------------------------------------");

		System.out.println(p1.getFeeStructure());
		System.out.println(p1.getFeeStructure().getClass().getName());
		System.out.println("---------------------------------------");
		
		System.out.println(p1.getProperties());
		System.out.println(p1.getProperties().getClass().getName());
		System.out.println("---------------------------------------");
		
		System.out.println(p1.getClass().getName());
		
		((ConfigurableApplicationContext) context).close();
	
	}
}