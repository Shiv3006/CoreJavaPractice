package com.bnt.collection;

import java.util.ArrayList;

public class Arraylist1 {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);

		al.add(2, 25);
		al.remove(4);
		al.remove(Integer.valueOf(30));
		System.out.println(al);
		/*
		 * System.out.println(al.contains(60)); System.out.println(al);
		 * 
		 * for (int a : al) { System.out.println(a); }
		 */

	}

}
