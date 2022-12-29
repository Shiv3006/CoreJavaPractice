package com.declaration28dec;

public class Student {
	String name;
	int rollno;
	int i;
	/*
	 * Student(String name,int rollno){ this.name=name; this.rollno=rollno;
	 * 
	 * }
	 */
	Student(int i){
		this.i=i;
	}
	
	public String toString() {
		return i+"";
	}
	
	
	public int hashCode() {
		return i;
	}
	
	public static void main(String[] args) {
		/*
		 * Student s=new Student("shiv",101); Student s2=new Student("swara",102);
		 * System.out.println(s); System.out.println(s.toString());
		 * System.out.println(s2);
		 */
		
		Student s=new Student(10);
		Student s1=new Student(100);
		System.out.println(s.toString());
		System.out.println(s1);
		
	}

}
