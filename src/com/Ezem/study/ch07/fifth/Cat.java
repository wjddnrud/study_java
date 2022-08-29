package com.Ezem.study.ch07.fifth;

public class Cat extends Animal {
	
	//생성자
	public Cat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	@Override
	public void sound(String aaa) {
		System.out.println("야옹" + aaa);
	}
	

}
