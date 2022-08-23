package com.Ezem.study.ch06;

public class CarSecond {

	
	String color = "red";
	int cc = 1500;
	
	String size = "midium";
	int tire = 4;
	
	
	CarSecond(String str) {
		color = str;
	}
	
	CarSecond(String str, int num) {
		color = str;
		cc = num;
	}
	
	CarSecond(String str1, int num1, String str2, int num2) {
		color = str1;
		cc = num1;
		size = str2;
		tire = num2;
	}
	
//	기본 생성자    명시적 생성자를 생성해주고 습관적으로 기본 생성자를 생성해주자!
	
	CarSecond() {
		
	}
}
