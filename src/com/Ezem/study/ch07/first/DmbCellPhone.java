package com.Ezem.study.ch07.first;

public class DmbCellPhone extends CellPhone {
//자식


	//필드
	int channel;
	
	//생성자 (명시적 생성자)
	DmbCellPhone(String model, String color, int channel) {
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	DmbCellPhone() {
		
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("전원을 켭니다.");
		
	}
	void changeChannelDmb(int channel) {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void turnOffDmb() {
		System.out.println("전원을 끕니다.");
	}
	public void say() {
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("channel : " + channel);
	}
}

	



























//public class DmbCellPhone extends CellPhone{
////자식
//	
//	//필드
//	int channel;
//	
//	//생성자 (명시적 생성자)
//	DmbCellPhone(String model, String color, int channel) {
//		this.model = model;
//		this.color = color;
//		this.channel = channel;
//	}
//	DmbCellPhone() {
//		
//	}
//	
//	//메소드
//	void turnOnDmb() {
//		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
//	}
//	void changeChannelDmb(int channel) {
//		this.channel = channel;
//		System.out.println("채널 " + channel + "번으로 바꿉니다.");
//	}
//	void turnOffDmb() {
//		System.out.println("DMB 방송 수신을 멈춥니다.");
//	}
//	
//	public void say(String model, String color, int channel) {
//		System.out.println("model : " + model);
//		System.out.println("color : " + color);
//		System.out.println("channel : " + channel);
//	}
//}
