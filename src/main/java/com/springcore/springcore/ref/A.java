package com.springcore.springcore.ref;

public class A {
	private int x;
	private B ob;
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return this.x;
	}
	
	public void setOb(B ob) {
		this.ob = ob;
	}
	
	public B getOb() {
		return this.ob;
	}
	
	public String toString() {
		return this.x + " " + this.ob.toString();
	}
}
