package com.junhee.java.arrayPrac;

import java.util.ArrayList;

public class ArrayMain {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("java");
		list.add("kkkk");
		list.add("adfasdfsaf");
		
		int size = list.size();
		System.out.println("list의 크기는 " + size + " 입니다." );
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("skill is" + skill);
		System.out.println();
		
		for (int i = 0; i < size; i++) {
			int result = i;
			String resultOut = list.get(i);
			System.out.println("index[" + result + "]는 " + resultOut + " 입니다.");
			
			
		}
		
		
		
	}

}
