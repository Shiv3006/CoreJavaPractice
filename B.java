package com.declaration;

abstract class A{
	
	final void m1() {
		System.out.println("Final method");
	}
	
	
}


class C extends  A{
	public static void main(String[] args) {
		C b=new C();
		b.m1();
	}
}

public  abstract class B{
	abstract void m1();
}

