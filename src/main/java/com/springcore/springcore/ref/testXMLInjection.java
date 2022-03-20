package com.springcore.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testXMLInjection {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/ref/configRef.xml");
		A abean = (A) context.getBean("aref");

		System.out.println(abean);
		
		((ConfigurableApplicationContext) context).close();
	}

}
