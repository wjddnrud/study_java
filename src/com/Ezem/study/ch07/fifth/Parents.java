package com.Ezem.study.ch07.fifth;

import java.util.Arrays;

public class Parents {
	
	int sum;
	
	
	
	Parents() {
		
	}
	
	public void myorder(int[] arr) {
		Arrays.sort(arr);
	}
	
	public int sum(int[] num) {
		
		sum = num[0] * num[1] + num[2];
		
		return sum;
	}
	
	
	
//	--------------------------
	
//	int sum = 0;
	int[] arr = new int[3];
	
	public void SortByAsc(int arr[]) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length -1; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	public int getSum(int arr[]) {
		sum = arr[0] * arr[1] + arr[2];
		return sum;
	}
	

}
