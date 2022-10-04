package com.Ezem.study.ch12.first;

import java.awt.Toolkit;

public class BeepPrintExample2 {

	public static void main(String[] args) {
		
//		소리와 출력이 동시에 되도록
//		쓰레드를 구현하는 3가지 방법
		
		//how1
//		런어블이라는 객체를 만들때 비프 태스크를 생성시켜서 생성된 객체를 쓰레드라는 객체를 만들때 생성시켜서 작동하게 만듬.
		
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		//how2
//		비프 태스크를 쓰지 않고 직접 구현한것
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();	
//				for(int i=0; i<5; i++) {		
//					toolkit.beep();
//					try { Thread.sleep(500); } catch(Exception e) {}
//				}
//			}
//		});
		
		//how3
//		Thread thread = new Thread(() -> {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();	
//			for(int i=0; i<5; i++) {		
//				toolkit.beep();
//				try { Thread.sleep(500); } catch(Exception e) {}
//			}
//		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("Beep!");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}
