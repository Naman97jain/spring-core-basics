package com.springcore.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class TestXMLBean {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springcore/collections/configCollections.xml");
		Employee emp = (Employee) context.getBean("emp1");

		System.out.println(emp.getName());
		System.out.println(emp.getPhones());
		System.out.println(emp.getCourses());
		System.out.println(emp.getAddresses());
		System.out.println(emp.getProps());		
		((ConfigurableApplicationContext) context).close();

	}
}
