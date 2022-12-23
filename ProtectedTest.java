package com.declaration;

public class ProtectedTest {
	protected void m1() {
		System.out.println("The Method is protected");
	}

}


 class B1 extends ProtectedTest{
	public static void main(String[] args) {
		ProtectedTest pt=new ProtectedTest();
		pt.m1();
		
		B1 b=new B1();
		b.m1();
		
		ProtectedTest pt1=new B1();
		pt1.m1();
	}
}