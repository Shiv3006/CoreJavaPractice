package com.declaration30dec;

public class DBDoubleEqalsOpAndEqualMethod {
	public static void main(String[] args) {
		String s=new String("shiv");
		String s1=new String("shiv");
		StringBuffer s2=new StringBuffer("shiv");
		StringBuffer s3=new StringBuffer("shiv");
		System.out.println(s==s1);//false
System.out.println(s.equals(s1));//true
System.out.println(s2==s3);//false
System.out.println(s2.equals(s3));//false
System.out.println(s.equals(s2));//false

Object o=new Object();
System.out.println(o==null);//false
System.out.println(o.equals(null));//false
	}

}
