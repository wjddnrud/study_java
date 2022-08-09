package com.Ezem.study.ch04;

public class SwitchExample {

	public static void main(String[] args) {
		
		
		
//		defualt는 없어도 되지만 가급적 넣어주자 if문에서 else와 같이 닫아주는 구문
		
		int num = 3;
		switch(num) {
			case 1:
				System.out.println("1번이 나왔습니다.");
				break;
			case 2:
				System.out.println("2번이 나왔습니다.");
				break;
			default:
				System.out.println("1도 2도 아닌 정수입니다.");	
				break;
		}
		
		String position = "대리";
		
		switch(position) {
		case "사원":   
			System.out.println("연봉은 5,000 입니다.");
			break;
		case "대리":
			System.out.println("연봉은 6,000 입니다.");
			break;
		case "과장":
			System.out.println("연봉은 8,000 입니다.");
			break;
		case "부장":
			System.out.println("연봉은 11,000 입니다.");
			break;
		case "사장":
			System.out.println("연봉은 20,000 입니다.");
			break;
		default:
			System.out.println("없는 position 입니다. 다시 입력해 주세요.");
			break;
		}
		
	}

}
