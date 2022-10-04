package com.Ezem.study.ch15.first;

import java.util.Arrays;
import java.util.List;

public class ArraysAsLIstExample {

	public static void main(String[] args) {
		
//		List 선언할때 배열안의 값 고정으로 정해주고 for each문으로 뽑아주기(string값)
//		향상된 FOR문 String타입의 name에 끝까지 하나씩 넣어준다
		List<String> list1 = Arrays.asList("장원영", "전지현", "장동건");
		for(String name: list1) {
			System.out.println(name);
		}
		
//		List 선언할때 배열안의 값 고정으로 정해주고 for each문으로 뽑아주기(integer값)
//		향상된 FOR문 Integer타입의 value에 끝까지 하나씩 넣어준다
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}
		
	}
}
