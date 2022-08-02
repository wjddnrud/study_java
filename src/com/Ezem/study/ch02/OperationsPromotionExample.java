package com.Ezem.study.ch02;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		
		
		// byte 변수 byteValue 선언하고 12로초기화
		byte byteValue = 12;
		
		// byte 변수 byteValue2 선언하고 12로 초기화
		byte byteValue2 = 12;
		
		// byte 변수 byteValue3 선언하고 위의 두 변수를 합 연산 수형
		byte byteValue3 = (byte) (byteValue + byteValue2);
		// int byteValue3 = byteValue + byteValue2;
		
		// byteValue3 결과 출력
		System.out.println(byteValue3);
		
		
		
		
		// short 변수 shortValue 선언하고 12로초기화
		short shortValue = 12;
		
		// byte 변수 byteValue2 선언하고 12로 초기화
		short shortValue2 = 12;
		
		// byte 변수 byteValue3 선언하고 위의 두 변수를 합 연산 수형
		short shortValue3 = (short) (shortValue + shortValue2);
		//int shortValue3 = shortValue + shortValue2;
		
		// byteValue3 결과 출력
		System.out.println(shortValue3);
		
		
		
		
		// int 변수 intValue 선언하고 12로초기화
		int intValue = 12;
		
		// int 변수 intValue2 선언하고 12로 초기화
		int intValue2 = 12;
		
		// int 변수 intValue3 선언하고 위의 두 변수를 합 연산 수형
		int intValue3 = intValue + intValue2;
		
		// intValue3 결과 출력
		System.out.println(intValue3);
				
				
				
				
		// long 변수 longValue 선언하고 12로초기화
		long longValue = 12;
		
		// long 변수 longValue2 선언하고 12로 초기화
		long longValue2 = 12;
		
		// long 변수 longValue3 선언하고 위의 두 변수를 합 연산 수형
		long longValue3 = longValue + longValue2;
		
		// longValue3 결과 출력
		System.out.println(longValue3);
		
		
		
		
		// float 변수 floatValue 선언하고 12로초기화
		float floatValue = 12;
		
		// float 변수 floatValue2 선언하고 12로 초기화
		float floatValue2 = 12;
		
		// float 변수 floatValue3 선언하고 위의 두 변수를 합 연산 수형
		float floatValue3 = floatValue + floatValue2;
		
		// floatValue3 결과 출력
		System.out.println(floatValue3);
		
		
		
		
		// double 변수 doubleValue 선언하고 12로초기화
		double doubleValue = 12;
		
		// double 변수 doubleValue2 선언하고 12로 초기화
		double doubleValue2 = 12;
		
		// double 변수 doubleValue3 선언하고 위의 두 변수를 합 연산 수형
		double doubleValue3 = doubleValue + doubleValue2;
		
		// doubleValue3 결과 출력
		System.out.println(doubleValue3);
		
		
		
		
		// byte 변수 byteValue4 를 선언하고 byteValue intValue합 연산 수행
		// (byte + int = int의 결과값이 나와야하는데 byte로 되어있어서 오류 발생
		//byte byteValue4 = byteValue + intValue;
		
		// int 변수 intValue4 를 선언하고 byteValue intValue 합 연산 수행
		int intValue4 = byteValue + intValue;
		
		// intValue4 결과 출력
		System.out.println(intValue4);
		
		
		//int 변수 intValue5를 선언하고 intValue 합 연산 수행
		//int intValue5 = intValue + doubleValue;
		
		//double 변수 doubleValue4를 선언하고 intValue doubleValue 합 연산 수행
		double doubleValue4 = intValue + doubleValue;
		
		//doubleValue4 결과 출력
		System.out.println(doubleValue4);
				
		
		
	}

}
