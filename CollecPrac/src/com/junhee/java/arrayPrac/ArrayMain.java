package com.junhee.java.arrayPrac;

import java.util.ArrayList;

public class ArrayMain {

	public static void main(String[] args) {
		
		// 1. ArrayList 객체 생성 
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("kkkk");
		list.add("adfasdfsaf");
		
		// 2. ArrayList의 저장된 데이터 개수 확인 
		int size = list.size();
		System.out.println("list의 크기는 " + size + " 입니다." );
		System.out.println();
		
		// 3. 특정 index의 데이터를 ArrayList에서 꺼내기 
		String skill = list.get(2);
		System.out.println("skill is" + skill);
		System.out.println();
		
		/* ArrayList에 저장된 데이터 전부 꺼내기 */
		for (int i = 0; i < size; i++) {
			int result = i;
			String resultOut = list.get(i);
			System.out.println("index[" + result + "]는 " + resultOut + " 입니다.");
			
			
		}
		
		
		
	}

}
