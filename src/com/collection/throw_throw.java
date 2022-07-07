package com.collection;

public class throw_throw {

public static void vote(int age ) {
		
		if (age>=18 ) {
			
			System.out.println("Able to vote");
		} else
			
			System.out.println("Unable to vote");
		}
	
        public static void main(String[] args) throws Throwable {
        	
        	vote(17);
        	
        }
}


