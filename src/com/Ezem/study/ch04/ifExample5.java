package com.Ezem.study.ch04;

public class ifExample5 {

	public static void main(String[] args) {


//		int 타입의 변수를 1개 선언하고
//		짝수인지 홀수인지 판단하여 결과를 출력하는 프로그램을 작성하시오.
		
		
		
		int num = 8381;
		
		if(num != 0) {
			if(num % 2 == 0) {
				System.out.println(num + "은(는) 짝수입니다.");
			} else {
				System.out.println(num + "은(는) 홀수입니다.");
			}
		} else {
//			num==0
			System.out.println("0은 홀짝을 판단할 수 없습니다.");
		}
	
	}
	

}
