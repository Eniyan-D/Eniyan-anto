package com.Java;

public class Abstact_2 extends Abstact {
	@Override
	public void username() {
		System.out.println("chithu@12345");
		
	}

	public void password() {
		System.out.println("12445478355");
		
	}
	
	public static void main(String[] args) {
		
		Abstact_2  a = new Abstact_2();
		a.username();
		a.password();
		a.LOGIN();
		
	}
	
}
