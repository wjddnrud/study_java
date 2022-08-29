package com.Ezem.study.ch07.fifth;

public class Child extends Parents {
	
	int sum;

	
	public int sum(int[] num) {
		
		sum = num[0] * num[1] + num[2] + 10;
		
		return sum;
	}
	
	
}
