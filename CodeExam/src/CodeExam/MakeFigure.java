package CodeExam;

public class MakeFigure {

	public static void main(String[] args) {

		MakeFigure main = new MakeFigure();
		// main.draw1("A", 5);
		// main.draw2("A", 5);
		// main.draw3("A", 5);
		// main.draw4("A", 5);
		// main.draw5("A", 5);
		/// main.draw6("A", 9);
		// main.draw7("A", 9);
		// main.draw8("A", 9);
		main.draw9("A", 7);

	}

	// 난이도 1 성공.
	public void draw1(String letter, int count) {

		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {

				System.out.print(letter);
			}
			System.out.println(" ");
		}
	}

	// 난이도 2 성공.
	public void draw2(String letter, int count) {

		for (int i = count; i > 0; i--) {
			for (int j = 0; j < count; j++) {
				if (j < i - 1) {
					System.out.print(" ");
				} else {
					System.out.print(letter);
				}
			}
			System.out.println();
		}
	}

	// 난이도 3 성공.
	public void draw3(String letter, int count) {

		for (int i = 0; i <= count; i++) {
			for (int j = 0; j < count - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print(letter);
			}
			System.out.println(" ");
		}
	}

	// 난이도 3.5 성공.
	public void draw4(String letter, int count) {

		for (int i = 0; i < count; i++) {
			if (i == 0) {
				for (int j = 0; j < count - 1; j++) {
					System.out.print(" ");
				}
				System.out.print(letter);
				System.out.println("");
			} else {
				for (int k = 0; k < count - i - 1; k++) {
					System.out.print(" ");
				}
				System.out.print(letter);
				for (int l = 0; l < 2 * i - 1; l++) {
					System.out.print(" ");
				}
				System.out.print(letter);
				System.out.println("");

			}

		}
	}

	// 난이도 3.6 성공.
	public void draw5(String letter, int count) {

		for (int i = 0; i < count; i++) {
			if (i == 0) {
				for (int j = 0; j < count - 1; j++) {
					System.out.print(" ");
				}
				System.out.print(letter);
				System.out.println("");
			} else if (i < count - 1) {
				for (int k = 0; k < count - i - 1; k++) {
					System.out.print(" ");
				}
				System.out.print(letter);
				for (int l = 0; l < 2 * i - 1; l++) {
					System.out.print(" ");
				}
				System.out.print(letter);
				System.out.println("");
			} else {
				for (int n = 0; n < 2 * i + 1; n++) {
					System.out.print(letter);
				}

			}
		}
	}

	// 난이도 3.8 성
	public void draw6(String letter, int count) {

		for (int i = 0; i <= count; i++) {
			if (i <= 4) {
				for (int j = 0; j < (int) count / 2 - i; j++) {
					System.out.print(" ");
				}
				for (int k = 0; k < 2 * i + 1; k++) {
					System.out.print(letter);
				}
				System.out.println(" ");
			} else {
				for (int l = 0; l < i - (int) count / 2; l++) {
					System.out.print(" ");
				}
				for (int n = 0; n <= 2 * (count - i - 1); n++) {
					System.out.print(letter);
				}
				System.out.println("");
			}
		}
	}

	// 난이도 4.0 성
	public void draw7(String letter, int count) {

		for (int i = 0; i < count; i++) {
			if (i < 5) {
				// 공백
				for (int j = 0; j < (int) count / 2 - i; j++) {
					System.out.print(" ");
				}
				// letter 출력
				for (int k = 0; k < i + 1; k++) {
					System.out.print(letter + " ");
				}
				// i = 5 부터 루핑
			} else {
				// i = 5, em 1
				// i = 6, em 2

				for (int m = 0; m < i - (int) count / 2; m++) {
					System.out.print(" ");
				}
				for (int n = 0; n < 2 * ((count - (i + 1))) + 1; n++) {
					System.out.print(letter);
				}
			}
			// 한줄 띔
			System.out.println("");
		}
	}

	// 난이도 5
	public void draw8(String letter, int count) {

		for (int i = 0; i < count; i++) {
			if (i % (count - 1) == 0) {
				for (int k = 0; k < count; k++) {
					System.out.print(letter);
				}
			} else {
				System.out.print(letter);
				for (int l = 0; l < count - 2; l++) {
					System.out.print(" ");
				}
				System.out.print(letter);
			}
			System.out.println("");
		}
	}

	public void draw9(String letter, int count) {
		
		for (int i = 0; i < count; i++) {
			for (int j = count; j >= i; j--) {
			System.out.print(letter);
		}
		System.out.println("");
		
		
		
	}
}
}
