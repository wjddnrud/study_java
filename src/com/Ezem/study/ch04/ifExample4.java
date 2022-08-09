package com.Ezem.study.ch04;

public class ifExample4 {

	public static void main(String[] args) {

//		int 타입의 변수를 2개 선언하고
//		두 정수가 주어졌을 때 사분면 어디에 해당되는지 출력하는 프로그램을 작성하시오.
		
		int x = 0;
		int y = 5;
		
		if (x > 0 && y > 0) {
			System.out.println("(" + x + "," + y + ") " + "제 1사분면입니다.");
		} else if (x < 0 && y > 0 ) {
			System.out.println("(" + x + "," + y + ") " + "제 2사분면입니다.");
		} else if (x < 0 && y < 0) {
			System.out.println("(" + x + "," + y + ") " + "제 3사분면입니다.");
		} else if (x > 0 && y < 0) {
			System.out.println("(" + x + "," + y + ") " + "제 4사분면입니다.");
		} else if (x==0 && y!=0) {
			System.out.println("(" + x + "," + y + ") " + "y축 위에 있습니다.");
		} else if (x!=0 && y==0) {
			System.out.println("(" + x + "," + y + ") " + "x축 위에 있습니다.");
		} else {
			System.out.println("(" + x + "," + y + ") " + "원접입니다.");
		}
		
	}

}
