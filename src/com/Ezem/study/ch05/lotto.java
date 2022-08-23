package com.Ezem.study.ch05;

public class lotto {

	public static void main(String[] args) {

		
		double min = 1.0;
		double max = 45.0;    // 로또로 할시 45;
//		int  random = (int)(Math.random() * (max - min) + min);
		
//		int random2 = (int)(Math.random() * (max - min) + min);
//		int random3 = (int)(Math.random() * (max - min) + min);
//		int random4 = (int)(Math.random() * (max - min) + min);
//		int random5 = (int)(Math.random() * (max - min) + min);
//		int random6 = (int)(Math.random() * (max - min) + min);
//		System.out.println("랜덤숫자 : " + random1 + " , " + random2 + " , " + random3 + " , "  + random4 + " , " + random5 + " , " + random6);
		
		
		
		int[] randomArray = new int[6];
		
		
		for(int i = 0; i < randomArray.length; i++) {
			int  random = (int)(Math.random() * (max - min) + min);
			randomArray[i] = random;
			if (random == random) {
				System.out.println("랜덤숫자: " + randomArray[i]);
			} else {
				System.out.println("동일한 랜덤 숫자가 나왔습니다. 다시 돌려주세요!");
			}
			
		}
		
	}

}
