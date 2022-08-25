package com.Ezem.study.ch07.second;

public class Student extends People {

	public int studentNo;
	
	
	//super 부모 클래스를 의미함.
//	super : 부모(상위)
//	this : 자식(하위 본 클래스)
	
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn);
		this.studentNo = studentNo;
	}
	
	public Student(String name, String ssn) {
		super(name, ssn);
	}
	
	public Student() {
//		super();
	}
//	Student(String name, String ssn, int studentNo) {
//		this.name = name;
//		this.ssn = ssn;
//		this.studentNo = studentNo;
//	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	void id() {
		System.out.println("이름 : " + name);
		System.out.println("ssn : " + ssn);
		System.out.println("studentNo : " + studentNo);
	}
	
}
