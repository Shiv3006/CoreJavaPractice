package com.bnt.oopsConcept3jan;

public class InstanceVariableTest extends NonStaticTest {
	
	int x=999;
	public static void main(String[] args) {
		NonStaticTest nst=new NonStaticTest();
		System.out.println(nst.x);
		InstanceVariableTest it=new InstanceVariableTest();
		System.out.println(it.x);
		NonStaticTest it1=new InstanceVariableTest();
		System.out.println(it1.x);
	}

}

class NonStaticTest {
	int x=888;
	
}