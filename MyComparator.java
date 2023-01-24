package com.bnt.collection;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)01;
		Integer i2=(Integer)02;
		
		if(i1<i2) {
			return -1;
		}
		else if(i1>i2) {
			return +1;
		}
		else
			return 0;
	}

}
