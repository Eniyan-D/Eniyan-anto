package com.Java;

public class String_function {
public static void main (String[]  args){
		
		String s = "welcome to java";
		
		int length = s.length();
		System.out.println(length);
		
		boolean equalsIgnoreCase = s.equalsIgnoreCase("welcome to java");
		System.out.println(equalsIgnoreCase);
	
		boolean equals = s.equals("welcome to java");
		System.out.println(equals);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase =s.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("W");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("e");
		System.out.println(endsWith);
		
		boolean contains = s.contains("cone");
		System.out.println(contains);
		
		int indexOf = s.indexOf("a");
		System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('a');
		System.out.println(lastIndexOf);
	
		
		String replace = s.replace('W','C');
		System.out.println(replace);
		
		String trim= s.trim();
		System.out.println(trim);
		
		String substring = s.substring(3,4);
		System.out.println(substring);
		
		boolean IsEmpty = s.isEmpty();
		System.out.println(IsEmpty);
		
		String[] split = s.split("welcome to java");
		System.out.println("/"+split);
		
		String concat = s.concat("chithu");
		System.out.println(concat);
		
s.split("");
}
}

