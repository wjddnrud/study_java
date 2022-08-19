package ch05;

public class ArrayInArrayExample {

	public static void main(String[] args) {


		int[][] scores = {{99,88,55}, {55,77,66}, {55,55,44}, {55,55,44}, {55,55,77}};
		
//		System.out.println("scores[1][1] : " + scores[1][1]);
				
//		1. 개인 점수의 국영수 평균을 구하시오.
//		2. 과목별 평균을 구하시오.
		
		
		String[] name = {"정우경", "장동건", "고소영", "서현진", "권정렬"};
		String[] subject = {"국어", "영어", "수학"};
		
		
//		1. 개인의 평균
		
		for(int i = 0; i < scores.length; i++) {
			int sum = 0; //각 사람마다 다시 sum값을 초기화해줘야하기 때문에 개천재!!!
			for(int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
//			System.out.println(name[i] + "의 평균 점수 : " + (double)sum/3);
			System.out.println(name[i] + "의 평균 점수 : " + (double)sum/scores[i].length);
		}
		
		System.out.println("----------------------------------------");
		
		
//		2. 과목별 평균
		
		int[] sum2 = new int[3];
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++ ) {
				sum2[j] += scores[i][j];
			}
		}
		
		
		for (int i = 0; i < sum2.length; i++) {
			System.out.println(subject[i] + " 과목의 평균 점수는 : " + ((double)sum2[i]/scores.length));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int a1 = scores[0][0];
//		int b1 = scores[0][1];
//		int c1 = scores[0][2];
//
//		int a2 = scores[1][0];
//		int b2 = scores[1][1];
//		int c2 = scores[1][2];
//		
//		int a3 = scores[2][0];
//		int b3 = scores[2][1];
//		int c3 = scores[2][2];
//		
//		int a4 = scores[3][0];
//		int b4 = scores[3][1];
//		int c4 = scores[3][2];
//		
//		int a5 = scores[4][0];
//		int b5 = scores[4][1];
//		int c5 = scores[4][2];
//		
//		double aver1 = (a1+b1+c1)/scores[0].length;
//		double aver2 = (a2+b2+c2)/scores[1].length;
//		double aver3 = (a3+b3+c3)/scores[2].length;
//		double aver4 = (a4+b4+c4)/scores[3].length;
//		double aver5 = (a5+b5+c5)/scores[4].length;
//		
//		double averA1 = (a1+a2+a3+a4+a5)/scores.length;
//		double averB1 = (b1+b2+b3+b4+b5)/scores.length;
//		double averC1 = (c1+c2+c3+c4+c5)/scores.length;
//		
//		
//		
//	
//		System.out.println("장원영의 국,영,수 평균 : " + aver1);
//		System.out.println("장원영의 국,영,수 평균 : " + aver2);
//		System.out.println("장원영의 국,영,수 평균 : " + aver3);
//		System.out.println("장원영의 국,영,수 평균 : " + aver4);
//		System.out.println("장원영의 국,영,수 평균 : " + aver5);
		
		
//		System.out.println("국어점수 평균 : " + averA1);
//		System.out.println("영어점수 평균 : " + averB1);
//		System.out.println("수학점수 평균 : " + averC1);
		
		
		
		
		
		
		
//		
//		
//		for(int i = 0; i < scores[0].length; i++) {
//			sum += scores[0][i];
//		}
//		double aver1 = sum/scores[0].length;
//		System.out.println(aver1);
//		
//		for(int i = 0; i < scores[1].length; i++) {
//			sum += scores[1][i];
//		}
//		double aver2 = sum/scores[1].length;
//		System.out.println(aver2);
//		
//		for(int i = 0; i < scores[2].length; i++) {
//			sum += scores[2][i];
//		}
//		double aver3 = sum/scores[2].length;
//		System.out.println(aver3);
//		
//		for(int i = 0; i < scores[3].length; i++) {
//			sum += scores[3][i];
//		}
//		double aver4 = sum/scores[3].length;
//		System.out.println(aver4);
//		
//		for(int i = 0; i < scores[4].length; i++) {
//			sum += scores[4][i];
//		}
//		double aver5 = sum/scores[4].length;
//		System.out.println(aver5);
//		
//				
			
		
	}

}
