package com.bnt.collection;

import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args) {
	
	TreeSet t=new TreeSet();
	t.add("s");
	t.add("h");
	t.add("i");
	t.add("v");
	t.add(new Integer(10));//ClassCastException//because treeset working on homogeneous data
	t.add(null);        // NullPointerException its have already null value
System.out.println(t);
}
}
