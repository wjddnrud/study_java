package ch06;

public class CarThirdExample {

	public static void main(String[] args) {

		CarThird carThird = new CarThird();
		
		CarThird carThird1 = new CarThird(3000, "아이오닉");
		
		CarThird carThird2 = new CarThird(2500, "벨로스터");
		
		CarThird carThird3 = new CarThird();
		String name = "제네시스";
		
		CarThird carThird4 = new CarThird("아이오닉", 4000, "silver");
		
		System.out.println("carThird2.name : " + carThird2.name);
		System.out.println("carThird2.cc : " + carThird2.cc);
		
		System.out.println("carThird3.name : " + carThird3.name);
		System.out.println("carThird3.cc : " + carThird3.cc);
		
		System.out.println("carThird4.name : " + carThird4.name);
		System.out.println("carThird4.cc : " + carThird4.cc);
		System.out.println("carThird4.color : " + carThird4.color);
		
		
	}

}
