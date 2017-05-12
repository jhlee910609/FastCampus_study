package com.junhee.java.fibo;

import java.util.ArrayList;

public class FiboMethod {

	int a;
	
	
	public ArrayList process(int userInput) {
		
		ArrayList<Integer> result = new ArrayList<>();
		
		int a = 0;
		result.add(a);
		int b = 1;
		result.add(b);
		
		while(a + b <= userInput) {
			int c = a + b;
			result.add(c);
			a = b;
			b = c;
			
		}
		return result;
		
		
		
		
		
		// 어레이리스트 사용하기 
	/*	
		Fibonacci fibo = new Fibonacci();
		
		int a = 0;
		result[0] = a;
		int b = 1;
		result[1] = b;
		
		int result_index = 2;

		// while문 사용
		while (a + b <= userInput) {
			int c = a + b;
			result[result_index] = c;
			
			result_index = result_index + 1;
			a = b;
			b = c;
		}
		
		return result;
		*/
		
	}

	/*public int[] fibo(int userInput) {

		int result[] = new int[100];

		int a = 0;
		result[0] = a;
		int b = 1;
		result[1] = b;
		
		int result_index = 2;

		// while문 사용
		while (a + b <= userInput) {
			int c = a + b;
			result[result_index] = c;
			
			result_index = result_index + 1;
			a = b;
			b = c;
		}
		
		return result;

		// for 
		for (int c = a + b; c <= userInput;) {
			System.out.println(c);
			a = b;
			b = c;
		}

	}
*/
	// 반환타입이 없는 함수 설계
	public void functionNoReturn() {

	}

	// 반환타입이 있는 함수 구현
	public int functionWithReturn() {
		int resutl = 0;
		return;

		// TODO

	}

}

// 반환타입이 없는 함수 설계
