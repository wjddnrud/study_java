package com.Ezem.study.ch06;

public class Board {

	
	
	String name = "초기값";
	int view = 0;
	boolean useNY = false;
	
	Board(String name) {
		this.name = name;
	}
	
	Board(String name, int view) {
		this.name = name;
		this.view = view;
	}
	
	Board(String name, Boolean useNY) {
		this.name = name;
		this.useNY = useNY;
	}

	Board(String name, int view, Boolean useNY) {
		this.name = name;
		this.view = view;
		this.useNY = useNY;
	}
	
	Board() {
		
	}
	
	public void show() {
		System.out.println("이름 : " + this.name);
		System.out.println("조회수 : " + this.view);
		System.out.println("사용여부 : " + this.useNY);
		System.out.println("---------------");
	}
	
	
}
