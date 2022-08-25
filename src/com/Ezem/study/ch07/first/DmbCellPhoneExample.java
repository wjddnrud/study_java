package com.Ezem.study.ch07.first;

public class DmbCellPhoneExample {

	public static void main(String[] args) {

		//부모 객체를 생성하고 powerOn 메서드 실행
		CellPhone cellphone = new CellPhone();
		
		cellphone.powerOn();
		
		//자식 객체 생성		
		DmbCellPhone dmbcellphone = new DmbCellPhone();
		
		//자식 객체의 turnOffDmb 실행
		dmbcellphone.turnOffDmb();
		
		//생성자를 이용하여 자식 객체 생성
		DmbCellPhone dmbcellphone2 = new DmbCellPhone("Iphone10", "Black", 10);
		
		
		//dmbCellPhone2 객체를 사용하여 자식 클래스의 함수 전체 호출
		dmbcellphone2.turnOnDmb();
		dmbcellphone2.changeChannelDmb(31);
		dmbcellphone2.turnOffDmb();
		dmbcellphone2.say();
		
		
		
		//dmbCellPhone2 객체를 사용하여 부모 클래스의 함수 전체 호출
		dmbcellphone2.powerOn();
		dmbcellphone2.powerOff();
		dmbcellphone2.bell();
		dmbcellphone2.sendVoice("생각하세요!");
		dmbcellphone2.receiveVoice("생각하세요!");
		dmbcellphone2.hangUp();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

//
////부모 객체를 생성하고 powerOn 메서드 실행
//
//CellPhone cellPhone = new CellPhone();
//
//cellPhone.powerOn();
//
////자식 객체 생성
//DmbCellPhone dmbCellPhone = new DmbCellPhone();
//
////자식 객체의 turnOffDmb 실행
//dmbCellPhone.turnOffDmb();
//
////생성자를 이용하여 자식 객체 생성
//DmbCellPhone dmbCellPhone2 = new DmbCellPhone("Iphone10", "Black", 6);
//
////dmbCellPhone2 객체를 사용하여 자식 클래스의 함수 전체 호출
//
//dmbCellPhone2.turnOnDmb();
//dmbCellPhone2.turnOffDmb();
//dmbCellPhone2.changeChannelDmb(89);
//
////dmbCellPhone2 객체를 사용하여 부모 클래스의 함수 전체 호출
//dmbCellPhone2.powerOn();
//dmbCellPhone2.powerOff();
//dmbCellPhone2.bell();
//dmbCellPhone2.sendVoice("살려주세요.");
//dmbCellPhone2.receiveVoice("살려주세요.");
//dmbCellPhone2.hangUp();