package com.Ezem.study.ch03;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		
		
//	 	++/-- 피연산자 : 다른 연산 수행전에 피연산자 1증가/감소
//		피연산자 ++/-- : 다른 연산 수행후에 피연산자 1증가/감소
		
		
		int i = 0;
		int j = 0;
		
		++i;
		j++;
		
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		
		
//		int 변수 a,b를 선언하고 초기값으로 1을 넣어 준다.
//		a 앞에 감소연산
//		b 뒤에 감소연산
//		두 변수의 결과를 출력
		
		
		int a = 1;
		int b = 1;
		
		--a;
		b--;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);		
		
		
//		int 변수 k 선언 후 초기값으로 
//		k = i ++;  k에 i 값인 1을 먼저 대입하고 ++수행
		int k = i++;
		
		System.out.println("k: " + k);
		System.out.println("i: " + i);
		
		
//		m = ++ j;  j앞에 ++먼저 수행하고 m에 ++된 j값 2를 대입
		
		int m = ++j;
		System.out.println("m: " + m);
		System.out.println("j: " + j);
		
		
		
		
		int z = ++i + j++;
	
		System.out.println("i: " + i);
		System.out.println("j: " + j);
		System.out.println("z: " + z);
		
		
	}

}
