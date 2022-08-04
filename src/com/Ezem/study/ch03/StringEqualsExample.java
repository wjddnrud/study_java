package com.Ezem.study.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {

		String str1 = "정우경";
		String str2 = "정우경";
		String str3 = new String("정우경");
		
		boolean result1 = (str1 == str2);
		System.out.println("result1 = " + result1);       // true
		
		boolean result2 = (str1 == str3);
		System.out.println("result2 = " + result2);       // flase
		
		
//		문자열이 같은지를 확인하는건 함수 변수명.equals(변수명); 을 쓴다.
		System.out.println("str1.equals(str2) : " + str1.equals(str2));   //== (x) true
		System.out.println("str1.equals(str3) : " + str1.equals(str3));   //== (x) true
		
		
		
		
	}

}
