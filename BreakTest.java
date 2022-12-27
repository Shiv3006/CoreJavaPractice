package com.declaration27dec;

public class BreakTest {

	public static void main(String[] args) {
		int x=10;
		l1:{
			System.out.println("start");
			if(x==11) 
				break l1;
			System.out.println("end");
		}
		System.out.println("hello");
		}

	}


