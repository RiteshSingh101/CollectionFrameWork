package com.collection.frame.work;

import java.util.Scanner;
import java.util.LinkedList;
public class BookShell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements you want to add: ");
		int num = sc.nextInt();
		
		LinkedList<Integer> l1 = new LinkedList<Integer>();
		
		for(int i = 0; i<num; i++) {
			System.out.println("Enter element: " + (i+1)+" : ");
			int value = sc.nextInt();
			l1.add(value);
		}
		
		System.out.println("Elements in linkedlist: "+l1);
		sc.close();
	}
}
