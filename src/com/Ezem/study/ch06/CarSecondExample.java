package com.Ezem.study.ch06;

public class CarSecondExample {

	public static void main(String[] args) {

	
		CarSecond carSecond = new CarSecond();
		String color;
		
		CarSecond carSecond2 = new CarSecond("blue");
		CarSecond carSecond3 = new CarSecond("white", 3000);
		String color2 = "Red";
	
		
//		System.out.println("carSecond.color: " + carSecond.color);
//		System.out.println("carSecond2.color: " + carSecond2.color);
//		System.out.println("carSecond2.cc: " + carSecond2.cc);
		
		
//		System.out.println("carSecond3.color: " + carSecond3.color);
//		System.out.println("carSecond3.cc: " + carSecond3.cc);
		
		
//		CarSecond carSecond4 = new CarSecond("black", 4500, "large", 8);
		CarSecond carSecond4 = new CarSecond();
		System.out.println("carSecond4.color : " + carSecond4.color);
		System.out.println("carSecond4.cc : " + carSecond4.cc);
		System.out.println("carSecond4.size : " + carSecond4.size);
		System.out.println("carSecond4.tire : " + carSecond4.tire);
		
		
	}

}
