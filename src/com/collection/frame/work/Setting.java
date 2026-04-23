package com.collection.frame.work;

import java.util.HashSet;
public class Setting {
	public static void main(String[] args) {
		HashSet<Object> s1 = new HashSet<Object>();
		
		s1.add(12);
		s1.add(12.23);
		s1.add("Bun");
		s1.add(12121111111L);
		s1.add('A');
		s1.add(true); 
		s1.add(233);

		System.out.println(s1);
		System.out.println(s1.hashCode());
		
		System.out.println("--------------");
		
		HashSet<Object> s2 = new HashSet<Object>();
		s2.add(12);
		s2.add(12.23);
		s2.add("Bun");
		s2.add(12121111111L);
		s2.add('A');
		s2.add(true);
		System.out.println(s2);
		System.out.println(s2.hashCode());
		System.out.println(s2.equals(s1));
		
	}
}
