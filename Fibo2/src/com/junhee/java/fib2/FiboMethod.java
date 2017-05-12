package com.junhee.java.fib2;

import java.util.ArrayList;

public class FiboMethod {

	public int[] fibo1(int userInput) {

		// 기초적인 배열문을 활용한 피보나치 수

		int result[] = new int[100];

		int a = 0;
		result[0] = a;
		int b = 1;
		result[1] = b;

		int result_index = 2;
/*
		// while문 사용
		while (a + b <= userInput) {
			int c = a + b;
			result[result_index] = c;

			result_index = result_index + 1;
			a = b;
			b = c;
			System.out.println(c);
		}
		return result;
*/
		// for
		for (int c = a + b; c <= userInput;) {
			System.out.println(c);		
			a = b;
			b = c;
			c = a + b;			
		}
		return result; 
		
	}	
		
	public ArrayList fibo2(int userInput) {
			
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
				System.out.println(c);	
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

}
