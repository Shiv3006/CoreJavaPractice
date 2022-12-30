package com.declaration30dec;

public class CloneMethodTest implements Cloneable{
	int i = 10;
	int j = 20;

	public static void main(String[] args) throws CloneNotSupportedException {
		CloneMethodTest ct=new CloneMethodTest();
		CloneMethodTest ct2=(CloneMethodTest) ct.clone();
		ct2.i=888;
		ct2.j=999;
		System.out.println(ct.i+" "+ct.j+" "+ct2.i+" "+ct2.j);
		
	}

}
