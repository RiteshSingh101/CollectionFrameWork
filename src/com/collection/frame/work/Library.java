package com.collection.frame.work;

import java.util.Scanner;
import java.util.LinkedList;

public class Library {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of student in library: ");
		int num = sc.nextInt();
	
		LinkedList<String> l1 = new LinkedList<String>();
		
		for(int i = 0; i<num; i++) {
			System.out.println("Enter name of student: ");
			String name = sc.next();
			l1.add(name);
		}
		
		System.out.println("Name of the students in library: "+l1);
		
	}
}
