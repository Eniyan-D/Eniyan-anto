package com.Java;

import java.util.Scanner;

public class Scanner_1 {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in) ;

		System.out.println("ENTER THE LAUNGUAGE ");
		String language=s.next();
		System.out.println(language);
		
		System.out.println("Enter your card ");
		String card = s.next();
		System.out.println(card);
	
		System.out.println("Enter you pin ");
		int pin =s.nextInt();
	    System.out.println(pin);
	    
	    System.out.println("Enter the money ");
	    int money = s.nextInt();
	    System.out.println(money);
		
	
	}

}
