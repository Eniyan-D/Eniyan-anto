package com.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set_1 {
public static void main(String[] args) {
		
		Set<Object> s = new HashSet<Object>();
		
		s.add(12);
		s.add(17);
		s.add(14);
		s.add(32);
		s.add(23);
		
		
		boolean contains = s.contains('c');
		System.out.println(contains);
		
		
		
		Set<Object> s1 = new TreeSet<Object>();
		
		s1.add(11);
		s1.add(15);
		s1.add(13);
		s1.add(25);
		s1.add(12);
		s1.add(22);
		s1.add(10);
		s1.add(20);
		
		s1.addAll(s);
		System.out.println(s1);
		
}

}