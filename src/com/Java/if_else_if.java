package com.Java;

import java.util.Scanner;

public class if_else_if {

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter the value");
		int mark=s.nextInt();
		
	
		if(mark>1 && mark<35) {
		System.out.println("fail");
	}else if (mark>35 && mark<50) {
		System.out.println("d-gread");
	}else if (mark>50 && mark<70) {
		System.out.println("c-gread");

}else if (mark>70 && mark<90) {
	System.out.println("b-gread");
}
else if (mark>90 && mark<100) {
	System.out.println("A-gread");
}
	else {
		System.out.println("invalid mark");
	}
}

}
