package com.declaration29dec;

public class AutoBoxingTest {

	public static void main(String[] args) {
		Integer x = 10;
		Integer y = x;
		x++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x == y);
	}

}
