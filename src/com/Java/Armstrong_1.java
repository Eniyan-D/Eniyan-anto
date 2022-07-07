package com.Java;

import java.util.Scanner;

public class Armstrong_1 {
	public static void main(String[] args ) {
		int rem =0,ans=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value");
		int n =s.nextInt();
		
		int a=n;
				
		while(n>0) {
			rem= n%10;
			ans=ans+(rem*rem*rem);
			n=n/10;
		}
		
		if(a==ans) {
			System.out.println("armstrong");
		}
		else {
			System.out.println("non amstrong");
		}
		
		
	}

}
