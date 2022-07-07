package com.Java;

import java.util.Scanner;

public class Switch_Statement {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter You Site ");
			String value =s.nextLine();
			
			
			switch (value) {
			
			case"flipkart":
				System.out.println("online shiping app");
			System.out.println("we can buy r sell our things");
			System.out.println("ott platform");
			break;
			
			case "netfilex":
				System.out.println("netfilex american ott platform");
				System.out.println("we can watch anime ");
				break;
				
				
			default:
				
				System.out.println("Check your spelling or try different keywords");
				break;
					
			}
		}
		
	}
	
	

}
