package com.junhee.java;

public class AJsdfj {

	public static void main(String[] args) {
		
	reflectString("name");
		
		
		
	}
		public static void reflectString (String inputString) {
			
		char eachAlphabet [] = inputString.toCharArray();
		char aString = 97;
		char sum = 219;
		char eachChar;
		int i;
		char result_each[] = new char[eachAlphabet.length];
		String result = "";
		
		for(i =0, eachChar = aString; i < eachAlphabet.length; i++){
			result_each[i] = (char) (sum - eachAlphabet[i]);
		}
		
		for(char temp : result_each){
			result += temp;
		}
		
		System.out.println(result);
    }
}

