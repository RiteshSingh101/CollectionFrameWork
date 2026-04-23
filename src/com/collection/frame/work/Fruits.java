package com.collection.frame.work;

import java.util.Stack;
public class Fruits {
	public static void main(String[] args) {
		Stack<Object> s1 = new Stack<Object>();
		s1.push("Mango");
		s1.push(20);
		s1.push(43.4);
		s1.push(123456765432L);
		s1.push(true);
		s1.push('A');
		System.out.println("Stack: "+s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.peek());
		// search(Object o) does NOT return index
		//It returns the position from the TOP of the stack (1-based)
		System.out.println(s1.search("Mango"));
		System.out.println(s1.isEmpty());
		s1.remove(0);
		System.out.println(s1);
		
	}
}
