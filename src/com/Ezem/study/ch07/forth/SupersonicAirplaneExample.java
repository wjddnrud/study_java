package com.Ezem.study.ch07.forth;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SupersonicAirplane supersonicairplane = new SupersonicAirplane();
		
		supersonicairplane.takeOff();
		supersonicairplane.fly();
		supersonicairplane.flyMode = SupersonicAirplane.SUPERSONIC;
		supersonicairplane.fly();
		supersonicairplane.flyMode = SupersonicAirplane.NORMAL;
		supersonicairplane.fly();
		supersonicairplane.land();
		
		
//		상수파일 생성후 코드
		supersonicairplane.takeOff();
		supersonicairplane.fly();
		supersonicairplane.flyMode = Constants.SUPERSONIC;
		supersonicairplane.fly();
		supersonicairplane.flyMode = Constants.NORMAL;
		supersonicairplane.fly();
		supersonicairplane.land();
		
	}

}
