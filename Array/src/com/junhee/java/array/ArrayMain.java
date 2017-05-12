package com.junhee.java.array;

public class ArrayMain {

	public static void main(String[] args) {

		int arr1[] = new int[10];
		
	
		
		for( int a1 : arr1) {
			System.out.println(a1);
		}		
		
		int arr2[] = { 1, 2, 3, 4, 5 };
		for( int a2 : arr2) {
			System.out.println(a2);
		}
		
		// 메모리만 할당되어 있지, 값을 넣어놓지 않았음
		// 
		
		ArraySub sub[] = new ArraySub[10];
		
		for( ArraySub subs : sub) {
			System.out.println(sub);
		}	
		// 배열 값으로 '객체 자체'를 저장할 수 있음
/*		
		sub [0] = new ArraySub();
		sub [1] = new ArraySub();
		sub [2] = new ArraySub();
		sub [3] = new ArraySub();
		sub [4] = new ArraySub();
		sub [5] = new ArraySub();
		sub [6] = new ArraySub();
		sub [7] = new ArraySub();
		sub [8] = new ArraySub();
		sub [9] = new ArraySub();
		
*/		
		
		
		
		

	}

}
