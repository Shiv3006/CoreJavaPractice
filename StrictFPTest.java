package com.declaration;

 strictfp class StrictFPTest {
	
	 strictfp void m1() {
	System.out.println(10.0/3);
}
	public static void main(String[] args) {
		StrictFPTest sfp=new StrictFPTest();
		sfp.m1();
	}

}
