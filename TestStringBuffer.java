package com.decalration.accessmodifiers1Jan;

public class TestStringBuffer {

	public static void main(String[] args) {
		
		String ss=new String("Shiv");
		//String ss2=new String("Shiv");
		String ss3="Shiv";
		StringBuffer s1=new StringBuffer("Shiv");
		StringBuffer s2=new StringBuffer("Shiv");
		StringBuilder s3=new StringBuilder("Shiv");
		StringBuilder s4=new StringBuilder("Shiv");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		//System.out.println(ss==ss2);
		System.out.println(ss==ss3);
		//System.out.println(ss.equals(ss2));
	}

}
