package com.declaration28dec;

public class EqualTest {

String name;
int rollno;
EqualTest(String name,int rollno){
	this.name=name;
	this.rollno=rollno;
	
}

public static void main(String[] args) {
	EqualTest et=new EqualTest("shiv",101);
	EqualTest et1=new EqualTest("swra",102);
	EqualTest et2=new EqualTest("shiv",101);
	EqualTest et3=et;
	
	
	System.out.println(et.equals(et1));
	System.out.println(et.equals(et2));
	System.out.println(et3.equals(et));
	
}
}
