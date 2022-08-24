package com.Ezem.study.ch06;

public class BoardExample {

	public static void main(String[] args) {

		
		
		Board board = new Board();
		Board board1 = new Board("자바 프로그래밍", 777, true);
		Board board2 = new Board("파이썬 프로그래밍", true);
		Board board3 = new Board("C언어 프로그래밍", 245);
		Board board4 = new Board("C언어 프로그래밍");
		
		board.show();
		board1.show();
		board2.show();
		board3.show();
		board4.show();
		
		
	}

}
