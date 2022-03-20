package com.springcore.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Certi certi;
	
	Person(String name, int personId, Certi certi){
		this.name = name;
		this.personId = personId;
		this.certi = certi;
	}
	
	public String toString() {
		return this.name + ": " + this.personId + "[" + this.certi.getName() + "]";
	}
}

class Addition{
	private int a;
	private int b;
	
	
	public Addition(int a, double b) {
		this.a = a;
		this.b = (int) b;
		System.out.println("Int and int sum");
	}
	
	public Addition(double a, int b) {
		this.a =(int) a;
		this.b = (int) b;
		System.out.println("double and double sum");
	}
	
//	public Addition(String a, String b) {
//		this.a = Integer.parseInt(a);
//		this.b = Integer.parseInt(b);
//		System.out.println("String and String sum");
//	}
	

	public int doSum() {
		return this.a + this.b;
	}
		
	
}
