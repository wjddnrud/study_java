package com.Ezem.study.ch03;

public class LogicalOperatorExample {
	public static void main(String[] args) {

//		&& = & : and : 논리곱 : 연산 참 참 참, 하나라도 폴스면 폴스
//		|| = | : or : 논리합 : 연산 참 폴스 참, 폴스 참 참, 참 참 참, 폴스 폴스 폴스
//		^ : 배타적 논리합 : 연산 참 참 폴스, 폴스 폴스 폴스, 참 폴스 참, 폴스 참 참 엇갈려야 참 같으면 폴스
		
		int a = 65;
		
		boolean result1 = (a >= 65);
		System.out.println("result : " + result1);
	
		boolean result2 = (a <= 90);
		System.out.println("result : " + result2);
		
		if(a >= 65 & a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
		
		if(a >= 65 && a <= 90) {
			System.out.println("65보다 크거나 같고 90보다 작습니다.");
		}
	
		System.out.println("----------------------------------------");
		
		if(a >= 65 | a <=90) {
			System.out.println("둘다 true");
		}
		
		if(a >= 66 | a <= 90) {
			System.out.println("한개만 true");
		}
		
		if(a >= 66 | a <= 50) {
			System.out.println("둘다 false라서 이 글은 보이지 않아야 되는데 말이지...");
		}
		
		if(a >= 65 || a <=90) {
			System.out.println("둘다 true");
		}
		
		if(a >= 66 || a <= 90) {
			System.out.println("한개만 true");
		}
		
		if(a >= 66 || a <= 50) {
			System.out.println("둘다 false라서 이 글은 보이지 않아야 되는데 말이지...");
		}
	
		System.out.println("----------------------------------------");
		
		if(a >= 65 ^ a <= 50) {
			System.out.println("이렇게 해야 보여진다.");
		}
		
		
		System.out.println("----------------------------------------");
		
		
		int x = 10; 
		
		if(x<=12 ^ x>=10) {
			System.out.println("true true = false 따라서 이 결과 값은 보여지면 안된다. ");
		}
		
		if(x<=5 ^ x>=30) {
			System.out.println("false false = false 따라서 이 결과 값은 보여지면 안된다.");
		}
		
		if(x<=12 ^ x>=30) {
			System.out.println("true false = true");
		}
		
		if(x<=5 ^ x>=10) {
			System.out.println("false 참 = true");
		}
	
	}

}
