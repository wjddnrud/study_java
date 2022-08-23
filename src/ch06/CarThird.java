package ch06;

public class CarThird {

//	명시적 생성자 : 함수의 이름은 똑같은데 매개 변수인 파라미터가 각각 다른것 이것을 오버로드라고 한다.
	String name = "아반떼";
	int cc = 3000;
	String color = "white";
	
	CarThird(String name) {
		this.name = name;
	}
	
	CarThird(int cc) {
		this.cc = cc;
	}
	
	CarThird(int cc, String name) {
		this.cc = cc;
		this.name = name;
	}
	
	CarThird(String name, int cc, String color) {
		this.name = name;
		this.cc = cc;
		this.color = color;
	}
	
//	기본 생성자 : 습관적으로 생성해줘야함!!
	CarThird() {
		
	}
	
}
