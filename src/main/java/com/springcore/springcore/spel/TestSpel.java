package com.springcore.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class TestSpel {
	public static void main(String args[]) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/springcore/spel/configSpel.xml");
		Demo demo = context.getBean("demo", Demo.class);
		System.out.println(demo);

		((ConfigurableApplicationContext) context).close();

		// Another way of using Spring Expression Language.
		SpelExpressionParser spelExParser = new SpelExpressionParser();
		Expression expression = spelExParser.parseExpression("11+22");
		System.out.println(expression.getValue());

	}
}
