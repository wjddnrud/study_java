package com.Ezem.study;

public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " x " + j + " : " + i*j) ;
				if(j==9) {
					System.out.println("-----------------");
				}
			}
		}
		
	}

}
