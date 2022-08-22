package ch06;

public class iphoneRun {

	public static void main(String[] args) {

		iphone user = new iphone();		
		
		System.out.println("iphone.name : " + user.name);
		System.out.println("iphoe.name : " + user.name2[1]);
		
		Car car = new Car();
		System.out.println("car.name : " + car.name);
		
		Handbag bag = new Handbag();
		System.out.println("Handbag.name : " + bag.name);
		
		car.name = "포르쉐";
		System.out.println("car.name : " + car.name);
	}

}
