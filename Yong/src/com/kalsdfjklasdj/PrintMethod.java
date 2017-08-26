package com.kalsdfjklasdj;

public class PrintMethod {
	/*
	public void Draw(String letter, int count) {
		int space = 0;
		for (int i = 0; i < count; i++){
			for (int l = 0; l < space; l++){
				System.out.print(" ");
			}
			for (int j = 0; j < count - i; j++){
				System.out.print(letter);
				for (int k = 0; k < count - i - 1; k++){
					System.out.print(" ");
				}
			}
			System.out.println();
			space += count - i - 1;
		}
	}
	*/
	
	public void Draw(String letter, int count) {
		int numFirstSpace = count * (count - 1) / 2;
		int numSecondSpace = -(count - 1);
		for(int i = 0; i < count; i++){
			// 3 Spaces
			System.out.print("   ");
			// first Spaces
			for(int j = 0; j < numFirstSpace; j++){
				System.out.print(" ");
			}
			numFirstSpace -= count - i - 1;
			// first Word
			System.out.print(letter);
			// Second Spaces
			numSecondSpace += (count - i) * 2;
			for (int k = 0; k < numSecondSpace; k++){
				System.out.print(" ");
			}
			// Second Word
			System.out.print(letter);
			// line break
			System.out.println();
		}
	}
}
