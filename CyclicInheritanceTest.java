package com.decalration.accessmodifiers1Jan;

public class CyclicInheritanceTest {

	public void m1(int i) {
		System.out.println("int type argument");
	}

	public void m1(float i) {
		System.out.println("float type argument");
	}

	public void m1(double i) {
		System.out.println("double type argument");
	}

	public static void main(String[] args) {
		CyclicInheritanceTest ct = new CyclicInheritanceTest();
		ct.m1(10);
		ct.m1(10.5f);
		ct.m1('s');
		ct.m1(10.5);
	}

}
