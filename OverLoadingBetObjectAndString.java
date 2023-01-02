package com.decalration.accessmodifiers1Jan;

public class OverLoadingBetObjectAndString {
	
	/*
	 * public void m1(String s) { System.out.println("string version"); } public
	 * void m1(Object o) { System.out.println("Object version"); }
	 */
	
	public void m1(String s) {
		System.out.println("string version");
	}
	public void m1(StringBuffer o) {
		System.out.println("StringBuffer  version");
	}
	public static void main(String[] args) {
		OverLoadingBetObjectAndString ob=new OverLoadingBetObjectAndString();
		/*
		 * ob.m1(new Object()); ob.m1("Shiv");
		 */
		
		ob.m1("shiv");
		ob.m1(new StringBuffer("shiv"));
		ob.m1(null);
	}
}
