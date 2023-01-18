package com.bnt.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet h=new HashSet();
		h.add("s");
		h.add("h");
		h.add("i");
		h.add("v");
		h.add("s");
		System.out.println(h.add("A"));
		System.out.println(h);
		
		System.out.println("*************************************");
		LinkedHashSet l=new LinkedHashSet();
		l.add("s");
		l.add("h");
		l.add("i");
		l.add("v");
		l.add("s");
		System.out.println(l.add("s"));
		System.out.println(l);
		

	}

}
