package com.springcore.springcore.eliminationComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean("samosa")
	public Samosa getSamosa() {
		return new Samosa();
	}
	
	@Bean(name= {"Example","ex","exple"})
	public Example getExample() {
		Example example = new Example();
		return example;
	}
	
	
}
