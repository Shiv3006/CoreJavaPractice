package com.declaration29dec;

public class ValueOfTest {

	public static void main(String[] args) {

		Integer i = Integer.valueOf("1111");
		System.out.println(i);

		Integer i1 = Integer.valueOf("1111", 3);
		System.out.println(i1);

		Character c = Character.valueOf('s');
		System.out.println(c);

		System.out.println("******************************************");

		Integer I = new Integer(150);
		System.out.println(I.byteValue());
		System.out.println(I.shortValue());
		System.out.println(I.longValue());
		System.out.println(I.floatValue());
		System.out.println(I.doubleValue());
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

		Double d=new Double(130);
		System.out.println(d.intValue());
		System.out.println(d.byteValue());
		System.out.println(d.shortValue());
		System.out.println(d.longValue());
		System.out.println(d.floatValue());
		
	}

}
