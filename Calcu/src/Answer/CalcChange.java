package Answer;

public class CalcChange {

	public void calc(int money, int price) {
		
		int units[] = {5000, 1000, 500, 100, 10};
		
		int change = money - price;
		System.out.println("거스름돈 : " + change);
		
		// 배열에 직접 연산식 혹은 메소드 넣지 않는다. 일종의 약속이자 법칙 (권고안임)
		int units_length = units.length;
		
		for(int unit : units) {
			change = printChange(change, unit);
		}
		// 일반적인 for문
		/*
		for(int unit : units) {
			change = printChange(change, unit);
		}
		*/
		
		
		

		/*
		 * // 거스름돈 int change = money - price; System.out.println("거스름 돈 = " +
		 * change + "원");
		 * 
		 * // 오천원 권 change = printChange(change, 5000);
		 * 
		 * 
		 * int c5000 = change/5000; change = change - c5000*5000;
		 * System.out.println("5000원 = " + c5000 + "개");
		 * 
		 * // 천원권
		 * 
		 * change = printChange(change, 1000);
		 * 
		 * 
		 * int c1000 = change/1000; change = change - c1000*1000;
		 * System.out.println(c1000);
		 * 
		 * 
		 * // 오백원권 change = printChange(change, 500);
		 * 
		 * int c500 = change/500; change = change - (c500*500);
		 * System.out.println("500 won = " + c500);
		 * 
		 * // 백원
		 * 
		 * change = printChange(change, 100);
		 * 
		 * int c100 = change/100; change = change - (c100*100);
		 * System.out.println("100 won = " + c100);
		 * 
		 * // 50 change = printChange(change, 50); change = printChange(change,
		 * 10);
		 */
	}

	public int printChange(int change, int unit) {
		int count = change / unit;
		change = change - (count * unit);
		System.out.println(unit + " 원 = " + change + "개");
		return change;
	}
}
