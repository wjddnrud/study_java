package com.Ezem.study.ch04;

public class RandomSum2 {

	public static void main(String[] args) {

		
//		1~100 사이의 랜덤 정수 2개를 발생시켜
//		두 수 사이의 수의 합을 구하라
		
		double min = 1.0;
		double max = 100.0;    // 로또로 할시 45;
		int random1 = (int)(Math.random() * (max - min) + min);
		int random2 = (int)(Math.random() * (max - min) + min);
		System.out.println("랜덤숫자 : " + random1 + " , " + random2);
		
		int sum = 0, min1 = 0, max1 = 0;
		
		if (random1 < random2) {
			max1 = random2;
			min1 = random1;
		} else {
			max1 = random1;
			min1 = random2;
		}
		System.out.println("min : " + min1 + "," + "max : " + max1);
		
		for (int i = min1; i <= max1; i++) {
			sum += i;
			System.out.println(i + " : " + sum);
//			System.out.println(i + " + " + i++ + " : " + sum);
		}
		System.out.println("total : " + sum);
		
		
	}

}
