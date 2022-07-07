package com.Java;

public class Im_mutable {
	public static void main(String[] args) {
		
	
	
	String s = "WHAT";
	String s1 = "what";
	String s2;
	
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	
	s2 = s+s1;
	System.out.println(s2);

	System.out.println(System.identityHashCode(s1));

}
}

