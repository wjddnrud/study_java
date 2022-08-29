package com.Ezem.study.ch07.fifth;

public class Dog extends Animal{
	public Dog() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("으르렁");
	}
	
	@Override
	public void sound(String bbb) {
		System.out.println("으르렁" + bbb);
	}
}
