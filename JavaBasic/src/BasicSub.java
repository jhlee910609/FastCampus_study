
public class BasicSub {

	public void typeCasting() {

		int number = 555;
		String num = "1000.35";
		Double db1 = Double.parseDouble(num);

		// Int num_temp = Interger.parseInt(num);
		// 숫자를 문자로 바꾸기, 숫자 + 문자 = 문
		String number_temp = number + "";
		// 아래 코드도 위와 같은 역할을 하지만 자주 사용하진 않음
		String str = String.valueOf(num);
		System.out.println(str);
 		System.out.println(number + db1);
 		
 		int intValue = 'A';
 		char charValue = (char)intValue;
 		System.out.println(charValue);

	}

	public void compare() {

		int a = 2;
		int b = 3;
		int c = 5;

		// &&(and)short cirit 앞부분 먼저 논리연산하고, false면 뒤에 것 연산하지 않음
		if (a < b && a < c) {
			System.out.println("a는 b와 c보다 작습니다.");
		}
		// ||(or) 역시 선행조건으로 후행조의 것 연산하지 않음, 연산처리 속도가 더 빠름 
		if (a < b || a < c) {
			System.out.println("a는 b와 c보다 작습니다.");
		}
	}

	public void threeOperan() {
		int a = 2;
		int b = 3;

		if (a > b) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		// ? = if, ? = else
		System.out.println(a > b ? true : false);
	}
	


}
