package com.springcore.springcore.eliminatingXML;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.springcore.eliminatingXML")
public class JavaConfig {
	@Bean("employee")
	public Employee getEmployee() {
		Employee emp =  new Employee();
		emp.setName("Jain");
		return emp;
	}
}
