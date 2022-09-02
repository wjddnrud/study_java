package com.Ezem.study.ch02;

public class CastingExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//강제 형변환 : casting : (원하는 형) 변수명
		
		double doubleValue = 1234567;
		System.out.println("doubleValue: " + doubleValue);
		
		double doubleValue2 = 1234567981;    //7자리 이상인 경우에는 e로 표현됨
		System.out.println("doubleValue2: " + doubleValue2);
	
		
		//float 변수에 double 대입
		float floatValue = (float) doubleValue;
		System.out.println("floatValue: " + floatValue);
	
		//  long <- float
		long longValue = (long) floatValue;
		System.out.println("longValue: " + longValue);
		
		//  int <- long
		int intValue = (int)longValue;
		System.out.println("intValue: " + intValue);
		
		//  short <- int
		short shortValue = (short)intValue;
		System.out.println("shortValue: " + shortValue);
		
		//  byte <- short
		byte byteValue = (byte)shortValue;
		System.out.println("byteValue: " + byteValue);
		
		
		//------------------------------------------------------
		
		// String을 int로 변환
		String from1="123";
		int to1 = Integer.parseInt(from1);
		System.out.println(to1 + 1);
		
		// int를 String으로 변환
		int from2 = 123;
		String to2 = Integer.toString(from2);
		System.out.println(to2 + 1);
		
		
		double to3 = Double.parseDouble(to2);
		System.out.println(to3 + 0.1);  //123.1
		
		String doubleValue3 = Double.toString(doubleValue2);
		System.out.println(doubleValue3 + 1); //123456789811
		
		boolean to4 = Boolean.parseBoolean(to2);
		System.out.println(to4);
		
		String to5 = Boolean.toString(to4);
		System.out.println(to5);
		
		
		
		
		
		

		
		// 위에는 내가한거 아래는 쌤이 해준것
		
		// int를 String으로 변환
		String StringValue = String.valueOf(intValue);
		System.out.println("StringValue: " + StringValue);
		
		// String을 int로 변환
		int intValue2 = Integer.parseInt(StringValue);
		System.out.println("intvalue2: " + intValue2);
		
		
		
	
	
	}

}
