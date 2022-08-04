package com.Ezem.study.ch03;

public class ConditionalOperationExample {

	public static void main(String[] args) {

		
//		삼항 연산자
		int score = 80;
		
		char grade = score > 90 ? 'A':'B';
		
		System.out.println("grade: " + grade);
		
		
		if(score > 90) {
			System.out.println("grade: A");
		}else {
			System.out.println("grade: B");
		}
	}
}
