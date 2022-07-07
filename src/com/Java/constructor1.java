package com.Java;

public class constructor1 {

	public constructor1(int a) {  //parameter
		System.out.println(a);
	}
	
	
	
	public constructor1( float b ) {
		System.out.println(b);
	
		
	}
		public constructor1() {  	// non-parameter
			System.out.println("non");
		
		}
	public static void main(String[] args) {
		
		
		//Classname ref = new Classname();
		
		constructor1 c= new constructor1(7);	
		constructor1 c1= new constructor1(6f);	
		constructor1 c2= new constructor1();	
	}
		
	}
	
	



