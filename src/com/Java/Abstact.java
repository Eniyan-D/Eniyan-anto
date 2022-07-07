package com.Java;

public abstract class Abstact {
	

public abstract void username();
	
	public abstract void password();
	
	public void LOGIN() {
		System.out.println("click the button");
	}
	
	public static void  main(String args[]) {
		
		 Abstact a= new  Abstact() {		 

			@Override
			public void username() {
				
			}

			@Override
			public void password() {
				
			}
		 
		 };
}
	
}