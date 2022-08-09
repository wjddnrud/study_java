package com.Ezem.study.ch04;

public class ifExample6 {

	public static void main(String[] args) {


//		int 타입의 변수를 3개 선언하고
//		세 정수중에서 최대값 최소값을 구하는 프로그램을 작성하시오.
		
		
		int a = 7;
		int b = 7;
		int c = 7;
		
		if(a>b && a>c) {
			if(b<c) {
				System.out.println("세 정수중 최댓값은 " + a + " 최솟값은 " + b + "입니다.");
			} else {
				System.out.println("세 정수중 최댓값은 " + a + " 최솟값은 " + c + "입니다.");
			}
		} else if(b>a && b>c) {
			if(a<c) {
				System.out.println("세 정수중 최댓값은 " + b + " 최솟값은 " + a + "입니다.");
			} else {
				System.out.println("세 정수중 최댓값은 " + b + " 최솟값은 " + c + "입니다.");
			}
		} else if(c>a && c>b) {
			if(a<b) {
				System.out.println("세 정수중 최댓값은 " + c + " 최솟값은 " + a + "입니다.");
			} else {
				System.out.println("세 정수중 최댓값은 " + c + " 최솟값은 " + b + "입니다.");
			}
		} else {
			System.out.println("a b c 세 정수 모두 같은 값입니다.");
		}
		
	
		
//		if(a != b && b != c && c != a) {
//			if(a>b && a>c) {
//				System.out.println("최댓값은 a: " + a);
//			} else if (b>a && b>c) {
//				System.out.println("최댓값은 b: " + b);
//			} else {
//				System.out.println("최댓값은 c: " + c);
//			}
//			
//			if(a<b && a<c) {
//				System.out.println("최솟값은 a: " + a);
//			} else if (b<a && b<c) {
//				System.out.println("최솟값은 b: " + b);
//			} else {
//				System.out.println("최솟값은 c " + c);
//			}
		
		
	}
	

}
