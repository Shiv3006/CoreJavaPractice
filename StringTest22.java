package com.declaration28dec;

public class StringTest22 {

	public static void main(String[] args) {
		String s=new String("shiv");
		String s2=new String("shiv");
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		System.out.println("*****************");
		StringBuffer s3=new StringBuffer("shiv");
		StringBuffer s4=new StringBuffer("shiv");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));

	}

}
