package com.declaration28dec;

public class Stringtest {
	
	public static void main(String[] args) {
		byte[] b= {100,101,102,103};
		String s=new String(b);
		System.out.println(s);
		
		
		String s1="SHIV";
		System.out.println(s1.equals("shiv"));
		System.out.println(s1.equalsIgnoreCase("shiv"));
		
		String ss="shivanjali";
		System.out.println(ss.substring(4));
		System.out.println(ss.substring(2, 9));
	}

}
