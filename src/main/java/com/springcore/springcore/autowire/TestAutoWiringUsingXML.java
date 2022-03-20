package com.springcore.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiringUsingXML {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springcore/autowire/configAutowire.xml");
		
		Employee e1 = context.getBean("emp1", Employee.class);
		System.out.println(e1);
		
		((ConfigurableApplicationContext) context).close();
	}

}
