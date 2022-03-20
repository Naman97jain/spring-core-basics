package com.springcore.springcore.eliminationComponent;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		Example example = context.getBean("ex", Example.class);
		System.out.println(example);
		example.exampleDisplay();
		System.out.println(example.getSamosa());
		
		Samosa samosa = context.getBean("samosa", Samosa.class);
		System.out.println(samosa);
		
		((AnnotationConfigApplicationContext) context).close();
	}
}
	