package com.junhee.java.fibo;

import java.util.ArrayList;

public class FiboMeth {

	public void process1(int input) {

		int a = 0;
		System.out.println(a);

		int b = 1;
		System.out.println(b);

		for (int c = a + b; c <= input;) {

			a = b;
			b = c;
			System.out.println(c);
			c = a + b;
		}
	}

	public void process2(int input1) {

		int a = 0;
		System.out.println(a);

		int b = 1;
		System.out.println(b);

		while (a + b <= input1) {
			int c = a + b;
			System.out.println(c);

			a = b;
			b = c;

		}
	}

	public int[] process3(int input2) {

		int result[] = new int[100];
		int a = 0;
		result[0] = a;
		System.out.println(a);

		int b = 1;
		result[1] = b;
		System.out.println(b);

		int result_index = 2;

		while (a + b <= input2) {

			int c = a + b;
			result_index = result_index + 1;
			result[result_index] = c;

			System.out.println(c);

			a = b;
			b = c;
		}
		return result;
	}

	public ArrayList process4(int input3) {

		ArrayList arr = new ArrayList();

		int a = 0;
		arr.add(a);

		int b = 1;
		arr.add(b);

		while (a + b <= input3) {

			int c = a + b;
			System.out.println(c);
			a = b;
			b = c;
			
		}
		return arr;
	}
}