package com.Ezem.study.ch04;

public class RandomSum {

	public static void main(String[] args) {

		
//		1~100 사이의 랜덤 정수 2개를 발생시켜
//		두 수 사이의 수의 합을 구하라
		
		double min = 1.0;
		double max = 100.0;    // 로또로 할시 45;
		int random1 = (int)(Math.random() * (max - min) + min);
		int random2 = (int)(Math.random() * (max - min) + min);
		System.out.println("랜덤숫자 : " + random1 + " , " + random2);
		
		int sum = 0;
		
		
		if(random1 < random2) {
			for(int i = random1; i <= random2; i++) {
				sum += i;
//				System.out.println(i);
			} 
			System.out.println("두 수 사이 숫자들의 합 : " + sum);
		} else if(random1 > random2) {
			for(int j = random2; j <= random1; j++) {
				sum += j;
//				System.out.println(j);
			} 
			System.out.println("두 수 사이 숫자들의 합: " + sum);
		} else {
//			랜덤 숫자 둘 다 같은게 나올 경우
			System.out.println("두 수 사이 숫자들의 합 : " + (random1 + random2));
		}
	}

}
