package com.bnt.oopsConcept3jan;

import java.io.EOFException;
import java.io.IOException;

public class MethodOverRiding {
	public void m1() {
		System.out.println("parent class method");
	}
	public void m2() {
		System.out.println("m2 2m695e9");
	}
	
	public static void main(String[] args) throws IOException {
		MethodOverRiding m1=new A();
		m1.m1();
		m1.m2();
	}

}


class A extends MethodOverRiding{
	public void m1() {
		System.out.println("child class method");
	}
	
	
	
}


/*
 * class B extends A { public void m1() throws Exception{
 * 
 * } }
 */


class C extends MethodOverRiding{
	public void m1() {
		System.out.println();
	}
}