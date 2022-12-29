package com.declaration29dec;

public class StringBufferTest {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("PI value is ");
		sb.append(3.14);
		sb.append(" it is exactly ");
		sb.append(true);
		System.out.println(sb);
		
		
		StringBuffer sb1=new StringBuffer("Shivanajali");
		System.out.println(sb1.delete(1, 6));
		System.out.println(sb1.deleteCharAt(2));
		
		StringBuffer sb2=new StringBuffer(100);
        System.out.println(sb2.capacity());
        sb2.append("shiv");
        sb2.trimToSize();
        System.out.println(sb2.capacity());


	}

}
