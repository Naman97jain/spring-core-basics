package com.springcore.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCI {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/ci/configci.xml");
//		Person p1 = (Person) context.getBean("person1");
		Addition add = (Addition) context.getBean("add");
		System.out.println(add.doSum());
		
		((ConfigurableApplicationContext) context).close();

	}

}


