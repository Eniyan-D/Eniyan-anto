package com.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_1 {

public static void main(String[] args) {
		
		Map<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(1, "java");
		m.put(2, "selenium");
		m.put(12,"selenium");
		m.put(null, "value");
		m.put(16,null);
		m.put(16, "name");
		m.put(20, "noooo");
		
		
		Set<Integer> keyset = m.keySet();
		System.out.println(keyset);
		
		
		Collection<String> values = m.values();
		System.out.println(values);
		
		Set<Entry< Integer,String>> entrySet = m.entrySet();
		
		for(Entry<Integer,String> entry : entrySet) {
			  System.out.println(entry);
			  
		}
}
}
		
		

