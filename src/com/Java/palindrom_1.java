package com.Java;

import java.util.Scanner;

public class palindrom_1 {
	public static void main(String[] args ) {
		int rem =0,ans=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int n =s.nextInt();
		
		int a=n;
		
		
		while(n>0) {
			rem= n%10;
			ans=ans*10+rem;
			n=n/10;
		}
		
		if(a==ans) {
			System.out.println("palindrom");
		}
		else {
			System.out.println("non palindrom");
		}
	
	}

}
