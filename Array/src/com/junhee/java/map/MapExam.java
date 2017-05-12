package com.junhee.java.map;

import java.util.HashMap;
import java.util.Set;

public class MapExam {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("이지현", "여동생");
		map.put("이준희", "나");
		map.put("박은경", "엄마");
		map.put("이재윤", "아빠");
		
		System.out.println("The number of my family members is " + map.size());
		
		System.out.println("\t이지현은 " + map.get("이지현") + "입니다.");
		System.out.println("\t이준희은 " + map.get("이준희") + "입니다.");
		System.out.println("\t이재윤은 " + map.get("이재윤") + "입니다.");
		System.out.println("\t박은경은 " + map.get("박은경") + "입니다.");
		
		//객체를 하나씩 처리
		Set<String> keyset = map.keySet();
		
	
		
		
		
		
	
		
		
		
	}

}
