package com.Java;

public class nested_forloop {

	
	public static void main(String[] args) {
		
		for(int a=1; a<5; a++) {//outer loop
			for(int b=1;b<=a;b--) {//inner loop
		// outer for loop have chance when inner loop is false 
		System.out.print("*");
}
			System.out.println();//newline
			}
}

}
