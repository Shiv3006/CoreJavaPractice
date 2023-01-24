package com.bnt.collection;

import java.util.TreeSet;

public class TreesetComparator {
	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>(new MyComparator());
		t.add(100);
		t.add(105);
		t.add(99);
		t.add(77);
		t.add(120);
		
		System.out.println(t);
	}
	

}
