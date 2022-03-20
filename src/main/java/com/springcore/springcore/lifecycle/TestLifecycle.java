package com.springcore.springcore.lifecycle;

//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycle {

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springcore/lifecycle/configLifecycle.xml");
		context.registerShutdownHook();
		
//		Samosa s1 = (Samosa) context.getBean("S1");
//		System.out.println(s1);
//		
//		Pepsi p1 = (Pepsi) context.getBean("P1");
//		System.out.println(p1);
		
		Example e1 = (Example) context.getBean("e1");
		System.out.println(e1);
		((ConfigurableApplicationContext) context).close();
	}

}
