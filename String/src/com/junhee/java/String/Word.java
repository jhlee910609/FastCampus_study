package com.junhee.java.String;

public class Word {

	public static void main(java.lang.String[] args) {

		String name = "안녕하세요";
		
		// 1. 글자 자르기.
										//시작 //끝.
		String secondWord = name.substring(1, 2);
		
		System.out.println(secondWord);
		
		// 2. 
		int 문자열길이 = name.length();
		System.out.println(문자열길이);
		
		// 3. 문자열 인덱스 첫 번째 character
		char 한글자 = name.charAt(0);
		System.out.println(한글자);
		
		//주로 첫 번째, 두 번째 메소드만 사용.
		// 해당 문자열의 "char"가 몇 번째 위치하는지 찾아
		int 몇번째 = name.indexOf("하");
		System.out.println(몇번째);
		
		// 4. 지정한 문자를 기준으로 앞, 뒤 두 동
		String 두덩이[] = name.split("하"); // return String;
		System.out.println(두덩이[0]);
		System.out.println(두덩이[1]);
		
		// 5. 찾아 바꾸기 
		String 바뀐글 = name.replace("하", "랄라라");
		System.out.println(바뀐글);
		
	}

}
