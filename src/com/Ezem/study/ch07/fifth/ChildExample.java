package com.Ezem.study.ch07.fifth;

public class ChildExample {

	public static void main(String[] args) {

		int[] arr = {13,2,6};
		int pResult;
		int cResult;
		
		Parents parents = new Parents();
		
		Child child = new Child();
		
		
		System.out.println("= 정렬 전 =");
		
		System.out.println("" + arr[0] + "," + arr[1] + "," + arr[2]);
		
		parents.myorder(arr);
		
		System.out.println("= 정렬 후 =");
		
		System.out.println("" + arr[0] + "," + arr[1] + "," + arr[2]);
		
		
		
		
		pResult = parents.sum(arr);
		
		System.out.println("= 부모 메서드 =");
		
		System.out.println(pResult);

		
		
		cResult = child.sum(arr);
		
		System.out.println("= 자식 메서드 =");
		
		System.out.println(cResult);
		
		
		
		
		
		
		
		
	}

}
