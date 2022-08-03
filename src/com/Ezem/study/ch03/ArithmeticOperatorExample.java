package com.Ezem.study.ch03;

public class ArithmeticOperatorExample {
	public static void main(String[] args) {

		
		
//		int 변수 v1에 초기값 5
//		int 변수 v2에 초기값 2
		
//		int 변수 result1에 + 연산후 출력
//		int 변수 result2에 - 연산후 출력
//		int 변수 result3에 * 연산후 출력
//		int 변수 result4에 / 연산후 출력
//		int 변수 result5에 % 연산후 출력
		
		
		int v1 = 5;
		int v2 = 2;
		
		int result1 = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1 * v2;
		int result4 = v1 / v2;
		int result5 = v1 % v2;
		
		System.out.println("result1: " + result1);
		System.out.println("result2: " + result2);
		System.out.println("result3: " + result3);
		System.out.println("result4: " + result4);
		System.out.println("result5: " + result5);
		
		
		
//		평점 표시하는 데이터에서 사용됨
		
		double result6 = v1 / v2;
		double result7 = (double) v1 / v2;
		
		System.out.println("result6: " + result6);
		System.out.println("result7: " + result7);
		
		
		
		
//		구몬 연산 기초
		
		/*
		 * double a = 5/3; double b = 5/8; double c = 49/5; double d = 5; double e =
		 * 3.25; double f = 11/6; double g = 12/17;
		 * 
		 * 
		 * 
		 * double resultA = (double a - double b) * c; double resultB =
		 * (double)d-(e-f)*g;
		 * 
		 * System.out.println(resultA); System.out.println(resultB);
		 * System.out.println(resultA); System.out.println(resultB);
		 * 
		 */ 
		
		
		
		
		
		
//		연산학습지
		
		int a1 = 8;
		int b1 = 7;
		int c1 = 5;
		
		int d1 = a1 + b1 + c1;
		
		System.out.println("연산학습지 1번문제 : " + d1);
		
		int a2 = 1;
		int b2 = 9;
		int c2 = 5;
		
		int d2 = a2 + b2 + c2;
		
		System.out.println("연산학습지 2번문제 : " + d2);
		
		int a3 = 5;
		int b3 = 6;
		int c3 = 6;
		
		int d3 = a3 + b3 + c3;
		
		System.out.println("연산학습지 3번문제 : " + d3);
		
		int a4 = 4;
		int b4 = 7;
		int c4 = 1;
		
		int d4 = a4 + b4 + c4;
		
		System.out.println("연산학습지 4번문제 : " + d4);
		
		int a5 = 7;
		int b5 = 5;
		int c5 = 5;
		
		int d5 = a5 + b5 + c5;
		
		System.out.println("연산학습지 5번문제 : " + d5);
		
		
		sum(8,7,5);
		sum(1,9,5);
		sum(5,6,6);
		sum(4,7,1);
		sum(7,5,5);
		
		
		
		aver("홍길동",60,70,85,90,45);
		aver("박말순",50,75,70,60,70);
		aver("고장난",55,60,64,58,90);
		aver("도룡뇽",80,70,63,88,78);
		
		
	}
	
	
	// 함수를 추가해주려면 class 안에 있으면서 main 바깥에 있어야 작동한다.
	// 세분화 함수끼리 작용할수 있도록 변수명으로 사용 가능 ex) sum을 aver 안에 적용시켜서 사용.
	
	public static void sum(int a, int b, int c) {
		
		System.out.println(a + " + "+ b + " + " + c + " = " + (a+b+c) );		
	}

	public static void aver(String name, int english, int math, int physics, int music, int athletic) {
		
		
		
		System.out.println(name + "(님)의 평균 : " + (double)(english + math + physics + music + athletic)/5);
		
	
	}

}
