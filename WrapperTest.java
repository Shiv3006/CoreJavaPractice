package com.declaration29dec;

public class WrapperTest {

	public static void main(String[] args) {
		Integer in = new Integer(10);
		Integer in1 = new Integer("10");
		// Integer in2=new Integer ("Ten");
		System.out.println(in);
		System.out.println(in1);
		// System.out.println(in2);

		Double d = new Double(10.5);
		Double d1 = new Double("10.5");
		// Double d2=new Double("TenPointFive");
		System.out.println(d);
		System.out.println(d1);
		// System.out.println(d2);

		Float f = new Float(10.5);
		Float f1 = new Float("10.5");
		Float f2 = new Float(10.5);
		Float f3 = new Float("10.5");
		System.out.println(f);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

		System.out.println("****************************************");
		Boolean b = new Boolean(true);
		Boolean b1 = new Boolean(false);
		Boolean b2 = new Boolean("true");
		Boolean b3 = new Boolean("false");
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
