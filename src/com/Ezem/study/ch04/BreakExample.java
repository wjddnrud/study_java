package com.Ezem.study.ch04;

public class BreakExample {

	public static void main(String[] args) {

		double min = 1.0;
		double max = 10.0;    // 로또로 할시 45;
//		int random = (int)(Math.random() * (max - min) + min);
//		System.out.println(random);
		
		while(true) {
			
			int random = (int)(Math.random() * (max - min) + min);
			
			System.out.println(random);
			
			if(random == 5) {
				break;
			}
		}
		
		System.out.println("-----------------");
		
		for (int i = 1; i < 10; i++) {
			int random2 = (int)(Math.random() * (max - min) + min);
			System.out.println(i + " : " + random2);
			if(random2 == 5) {
				break;
			}
		}
		
		
		System.out.println("-----------------");
		
		aa:
		for (int j = 1; j <= 10; j++) {
			for (int i = 1; i < 10; i++) {
				int random3= (int)(Math.random() * (max - min) + min);
				System.out.println(j + " : " + i + " : " + random3);
				if(random3 == 5) {
					break aa;
//					break; // 차이를 이해하여야 함
				}
			}
		}
		
		System.out.println("-----------------");
		
//			cc: random3이 3이 나오면 cc위치를 break 시킨다는 의미 그 위의 반복문은 계속 진행
		
			for (int x = 1; x <= 10; x++) {
				cc : for  (int y = 1; y <= 10; y++) {
					for (int z = 1; z <= 10; z++) {
						int random3= (int)(Math.random() * (max - min) + min);
						System.out.println(x + " : " + y + " : " + z + " : " + random3);
						if(random3 == 3) {
							break cc;
						}
					}
				}
			}
		
		
		
	}

}
