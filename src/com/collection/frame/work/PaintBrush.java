package com.collection.frame.work;

import java.util.Collections;
import java.util.Vector;

public class PaintBrush {
	public static void main(String[] args) {
		Vector<Object> v1 = new Vector<Object>();
		
		v1.add(24);
		v1.add(25);
		v1.add(20);
		v1.add(34);
		System.out.println(v1);
		System.out.println("------------");
		
//		Collections.sort(v1);
		System.out.println(v1);
		System.out.println("------------------");
		Collections.reverse(v1);
		System.out.println(v1);
	}
}
