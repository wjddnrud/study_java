package ch05;

public class ArrayCreateByValueListExample1 {

	public static void main(String[] args) {

		
		int[] scoreEnlish;
		int scoreMath[];
		
		int[] scoreChemistry = {88,99,45,86,34};

		String[] name = {"장원영", "장동건", "고소영"};
		
		System.out.println("누굴까 : " + name[2]);
		
		System.out.println("명지님 화학 성적 : " + scoreChemistry[0]);
		
		
//		scoreChemistry의 평균을 구해서 출력하시오.
		
		int sum = 0;
		double avg = 0.0;
		
		for(int i = 0; i < 5; i++) {
			sum += scoreChemistry[i];
		}
		System.out.println("평균 : " + (double)sum/5);
		
		
		for(int i = 0; i < scoreChemistry.length; i++) {
			sum += scoreChemistry[i];
		}
		System.out.println("평균 : " + (double)sum/scoreChemistry.length);
		
		
		
		
	
	}

}
