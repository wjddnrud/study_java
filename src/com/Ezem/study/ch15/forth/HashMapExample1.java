package com.Ezem.study.ch15.forth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
//		이름으로 불러야하니까 대부분 key값은 String으로 쓰는편
//		object는 java에서 거의 최상위 클래스 여기에는 아무거나 사용 가능
	
		
//		iterabel의 상속을 받는게 없으므로 다른 영역 
//		따라서 List에서 add를 쓴것과 다르게 put을 써준다.
		
		//객체 저장
		map.put("신용권", 85);
		map.put("동장군", 80);
		map.put("홍길동", 90); 
//		map.put("홍길동", 95);
		System.out.println("총 Entry 수: " + map.size());
		
		//객체 찾기		
//		System.out.println("\t홍길동 : " + map.get("홍길동"));	//	
//		System.out.println("---------");
		
		//객체를 하나씩 처리
//		출력하기 위한 하나의 방법
//		iterator를 쓰려면 이런식으로 돌려서 사용해야한다는 것을 보여주는것
		
		Set<String> keySet = map.keySet();
//		일종의 캐스팅 비슷한것이다.
		
		
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
		  String key = keyIterator.next();
		  Integer value = map.get(key);
		  System.out.println("\t" + key + " : " + value);
		}		
		System.out.println();	
		
//		-----------------------------------주로 위의 것을 많이 쓴다.
		
		
		
		Map<String, Integer> map2 = new LinkedHashMap<>();
		
		map2.put("신용권", 85);
		map2.put("동장군", 80);
		map2.put("홍길동", 90);
		
		Set<String> keySet2 = map2.keySet();
		
		Iterator<String> keyIterator2 = keySet2.iterator();
		
		while(keyIterator2.hasNext()) {
		  String key = keyIterator2.next();
		  Integer value = map2.get(key);
		  System.out.println("\t" + key + " : " + value);
		}		
		System.out.println();
		
	}

}
