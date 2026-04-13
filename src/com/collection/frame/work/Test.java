package com.collection.frame.work;

import java.util.Vector;
import java.util.ArrayList;
public class Test {
	public static void main(String[] args) {
		//Adding One Collection in Another Collection
		Vector<String> v1 = new Vector<String>();
		v1.add("Trump");
		v1.add("Punit");
		v1.add("Deepak");
		v1.add("Urfi");
		
		ArrayList<Object> a1 = new ArrayList<Object>();
		a1.add(500);
		a1.add(true);
		a1.addAll(v1);
		a1.add("Rakhi");
		a1.add("Sara");
		System.out.println(v1);
		System.out.println(a1);
		System.out.println(a1.containsAll(v1));
		System.out.println(a1.remove("Trump"));
		System.out.println(a1.remove("Deepak"));
		System.out.println(a1);
		System.out.println(a1.containsAll(v1));
		a1.clear();
		System.out.println(a1);
	}
}
