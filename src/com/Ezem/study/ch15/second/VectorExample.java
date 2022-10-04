package com.Ezem.study.ch15.second;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
//		동기화가 지원된다는것만 알아두자
//		Board class의 함수로 값 입력하고 2번째 삭제후 정렬된부분에서 3번 삭제
		
		List<Board> list = new Vector<Board>();
	
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5")); 
		
		list.remove(2);
		list.remove(3);
		
//		\t : 수평 탭
		for(int i=0; i<list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		} 
	} 
}
