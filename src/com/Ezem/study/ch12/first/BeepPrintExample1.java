package com.Ezem.study.ch12.first;

import java.awt.Toolkit;

public class BeepPrintExample1 {

	public static void main(String[] args) {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		for(int i=0; i<5; i++) {		
			toolkit.beep();
			try { Thread.sleep(500); } catch(Exception e) {}
//			500밀리세컨 만큼 잠시 멈추는 것
		}

		for(int i=0; i<5; i++) {
			System.out.println("Beep!");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}

}
