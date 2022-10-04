package com.Ezem.study.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		
//		list에 하나씩 추가하는 것
		
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");     // index 직접 지정해줄 수도 있다. 그럼 뒤에거는 자동을 밀림
		list.add("iBATIS");

//		list의 전체 갯수
		
		int size = list.size();
		System.out.println("총 객체수: " + size);		
		System.out.println();
		
		
//		get으로 값 가져와서 출력해보고
		
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

//		for문으로 뽑기
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		System.out.println();
				
		
//		2번 index 제거 한번더 제거 ibatis제거 
		
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");		
		
//		제거하고 나머지 for문으로 뽑기
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
	}

}
