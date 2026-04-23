package com.collection.frame.work;

import java.util.ArrayList;
import java.util.List;
public class Marker {
	public static void main(String[] args) {
		List<String> a1 = new ArrayList<String>();
		a1.add("Blue Marker");//0
		a1.add("Red Marker");//1
		a1.add("Green Marker");//2
		a1.add("Green Marker");//3
		a1.add("Black Marker");//4
		a1.add("Green Marker");//5
		a1.add("Blue Marker");//6
		a1.add("Red Marker");//7
		System.out.println(a1);
		System.out.println(a1.contains("Blue Marker"));
		System.out.println(a1.indexOf("Red Marker"));
		System.out.println(a1.lastIndexOf("Green Marker"));
		a1.add(1, "Pink Marker");
		System.out.println(a1);
		System.out.println("-------------");
		a1.set(3, "Yellow Marker");
		System.out.println("-----------");
		System.out.println(a1);
		
		
		System.out.println("-------------------");
		
		List<Object> a2 = new ArrayList<Object>(5);
		a2.add(10);
		a2.add(20);
		a2.add(30);
		a2.add(40);
		a2.add(50);
		a2.add(0);
		System.out.println(a2);
		
		System.out.println("-------------------------");
		
		List<Object> a3 = new ArrayList<Object>(a1);
		System.out.println(a3);
		
	}
}

