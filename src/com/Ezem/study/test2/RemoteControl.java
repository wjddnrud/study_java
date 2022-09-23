package com.Ezem.study.test2;

public interface RemoteControl {

	// 상수
	public static final int max_volume = 10;
	public static final int min_volume = 0;
	
	//추상 메서드 : 
	public abstract void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메서드 :
	default void setMute(boolean mute) {
		
		if(mute) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	// 정적 메서드 : 
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
	
	
		

}
