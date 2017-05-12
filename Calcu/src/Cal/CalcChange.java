package Cal;

public class CalcChange {

	public void Calc(int money, int price) {
		int units[] = { 5000, 1000, 500, 100, 50, 10 };
		int change = money - price;
		for (int unit : units) {
			change = printChange(change, unit);
		}
		
		int unit_length = units.length;
/*		
 		// 일반 for문 사용
		for (int i = 0 ; i < unit_length ; i++) {
			change = printChange(change, units[i]);
		}

		change = printChange(change, 5000);
		change = printChange(change, 1000);
		change = printChange(change, 500);
		change = printChange(change, 100);
		change = printChange(change, 50);
		change = printChange(change, 10);
		
*/	
		}

	public int printChange(int change, int unit) {
		int count = change / unit;
		change = change - (count * unit);
		System.out.println(unit + " 원 = " + count + "개");
		return change;
	}

}
