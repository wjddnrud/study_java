package com.Ezem.study.ch06;

public class Korean {
	
	String name;
	String ssn;
	int age;
	
	Korean(String name) {
		this.name = name;
	}
	
	Korean(String name, String snn) {
		this.name = name;
		this.ssn = snn;
	}
	
	Korean(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Korean() {
		
	}

	static String nationality = "대한민국";

	static int staticTest (int a) {
		return a + 10;
	}
	int staticTest2 (int a) {
		return a - 10;
	}
	
	public static void ttest2() {
		arithmetics.staticTest();
	}
	

}
