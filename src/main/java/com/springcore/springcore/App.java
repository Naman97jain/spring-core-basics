package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/springcore/config.xml");
		Student student = (Student) context.getBean("student1");
		System.out.println(student);
		((ConfigurableApplicationContext) context).close();
	}
}




