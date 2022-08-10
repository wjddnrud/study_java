package com.Ezem.study.ch04;

public class ForPrintFrom1To10Example {

	public static void main(String[] args) {

//		1부터 10까지의 합을 구하는 프로그램을 작성하시오.
		
//		1. 관례적으로 int i = 0;은 for문 안에 써준다.
//		2. 관례적으로 i를 쓰는 이유는 index값이어서 i로 쓴다.
		
		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			sum += i;
		}
		System.out.println("sum: " + sum);
	}

}
