
public class BasicMain {
	
	/*	
		 * int a = 37; int b = 56;
		 

		
		 * System.out.println("a+b = " + (a + b)); // 산술식에 있어 괄호 선처리함 // 숫자 + 문자
		 * = 문자화됨
		 * 
		 * // 조건문 if if (a > b) { System.out.println("a is bigger than b"); }
		 * else if (a == b) { System.out.println("a equal b"); } else {
		 * System.out.println("a is smaller than b"); }
		 

		// 조건문 switch

		
		 * switch (a) {
		 * 
		 * case 37: System.out.println("a is 37"); break; // break; 전략적 사용하면 유용함
		 * 
		 * case 38: System.out.println("a is 38"); break;
		 * 
		 * }
		 

		
		 * for (int i = 0; i < 100; i = i + 1) { System.out.println(i); }
		 * 
		 
		
		 * int result = 0; for (int i = 0; i <= 100; i++) { if (i % 2 != 0) {
		 * result += i; } } System.out.println("홀수 더한 결과값 : " + result); }
		 

		double start = 0;
		double end = 9999999999L;

		// double result = 0;
		// star 부터 end까지 더한 결과값 출력
		
		 * for ( double i = start ; i <= end ; i++) {
		 * 
		 * 
		 * }
		 
		double result = (end - start) * (start + end) / 2;
		System.out.println(result);
		
		
		public void sumFloat(float a, float b) {
			// 대문자 Float 사용시, 내장 객체화 및 함수사용 가능
			// 소수점 잍의 것 직접 연선할 경우 결과값 오류날 경우가 높음
			// 그래서 객체화 및 내장 함수를 활용하여 연산. 정확한 결과값 산 
			
			Float temp_a = a;
			Float temp_b = b;
			
			float result = Float.sum(a, b);
			*/

	public static void main(String[] args) {
		
		
		int a = 1;
		int b = 2;
		
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(!(a>b));
		System.out.println(b==2);
		System.out.println(!(a!=b));
		System.out.println();
		System.out.println(true == false);
		System.out.println(true == (1>0));
		System.out.println(!!!!true);
		
		BasicSub sub = new BasicSub();
		sub.typeCasting();
		
		


	}

}

			
	

