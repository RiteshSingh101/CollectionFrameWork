package com.collection.frame.work;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		List<Object> l1 = new ArrayList<>();
		l1.add("abc");//0
		l1.add("pqr");//1
		l1.add("mnc");//2
		l1.add("abc");//3
		l1.add("xyz");//4
		l1.add("abc");//5
		System.out.println(l1.lastIndexOf("abc"));
	}

}
