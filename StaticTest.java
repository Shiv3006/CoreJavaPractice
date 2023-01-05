package com.bnt.oopsConcept3jan;

 class StaticMethodTest {
	
	public static void m1() {
		System.out.println("parent class method");
	}

}

public class StaticTest extends StaticMethodTest{
	public static void m1() {
		System.out.println("child class method");
	}
	
	
	public static void main(String[] args) {
		StaticMethodTest st=new StaticMethodTest();
		st.m1();
		StaticTest ss=new StaticTest();
		ss.m1();
		StaticMethodTest st1=new StaticTest();
		st1.m1();
		
	}
}
