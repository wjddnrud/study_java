package com.Ezem.study.ch15.third;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		
//		최상단 interface에 잇는 iterable
		
//		향상된 for문과 또다른 패턴이 있다는것을 다른 표현 방법이 있다는 것을 보여주기 위함
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체수: " + set.size());
		
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
//		요술주머니 안을 전부다 비우는것 
		set.clear();
		
//		요술주머니 안이 비어 있다면 비어있음 출력
		
		if(set.isEmpty()) {
			System.out.println("비어 있음"); 
		}
	}

}
