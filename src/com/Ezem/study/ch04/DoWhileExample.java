package com.Ezem.study.ch04;

public class DoWhileExample {

	public static void main(String[] args) {

		
		int i = 1;
		int sum = 0;
		
		do {
			sum += i;
			System.out.println(i + " : " + sum);
			i++;
		} while (i <= 10);
	}

}
