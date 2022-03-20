package com.springcore.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class Demo {
	//Check evaluation expression
	@Value("#{11+22}")
	private int x;
	
	//Check evaluation expression
	@Value("#{2+4}")
	private int y;
	
	//Check standAlone collection by @Value
	@Value("#{demoValues}")
	private List<String> demoVal;
	
	//Check static class member function calling
	@Value("#{T(Math).sqrt(25)}")
	private double checkClassMethod;
	
	//Check static class member variable fetching
	@Value("#{T(Math).E}")
	private double checkClassVariable;

	//Check object creation expression
	@Value("#{new String('Naman')}")
	private String checkObjectCreation;
	
	@Value("#{8-3>=5}")
	private boolean isTrue;
	
	
	public String toString() {
		return "[ x = " + this.x + " y = " + this.y + " demoVal = " + this.demoVal + " \ncheckClassMethod = "
				+ this.checkClassMethod + " checkClassVariable = " + this.checkClassVariable + 
				"\ncheckObjectCreation = " + this.checkObjectCreation + 
				"\nisTrue = " + this.isTrue + "]";
	}

}
