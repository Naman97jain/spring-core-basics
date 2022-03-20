package com.springcore.springcore.checkScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCheckScope {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springcore/checkScope/configCheckScope.xml");
		
		System.out.println("Checking bean scope feature with annotation");
		Person p1 = context.getBean("person", Person.class);
		System.out.println(p1.hashCode());
		System.out.println("-------------------------------------------------");
		Person p2 = context.getBean("person", Person.class);
		System.out.println(p2.hashCode());
		
		System.out.println("-------------------------------------------------");
		System.out.println("-------------------------------------------------");
		
		System.out.println("Checking bean scope feature with config.xml");
		Animal a1 = context.getBean("animal", Animal.class);
		System.out.println(a1.hashCode());
		System.out.println("-------------------------------------------------");
		Animal a2 = context.getBean("animal", Animal.class);
		System.out.println(a2.hashCode());
		
		
		((ConfigurableApplicationContext) context).close();
	}
}
