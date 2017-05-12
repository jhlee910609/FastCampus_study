package StringExam;

public class WordCountMain {

	public static void main(String[] args) {
		WordCountMain main = new WordCountMain();
		System.out.println("10,000까지 8의 개수는 = " + main.count(10000, 8));
	}

	public int count(int limit, int target) {
		
		int result = 0;
		String unit = target + "";
		
 

 
		for (int i = 0; i <= limit; i++) {
			String temp = i + ""; // for문 문자화 
			String array[] = temp.split("");
			for(String item : array) {
				if(item.equals(unit)) {
					result = result + 1;
				}
			}
		}
		return result;
	}


		
/*		다시 해보기 계속 값이 0뜸 ㅜ
		for (int i = 0; i <= limit; i++) {
			String temp = i + "";
			
			int temp_length = temp.length();
			for (int j = 0; j < temp_length; j++) {
				char one = temp.charAt(j);
				if (unit.equals(one)) {
					result = result + 1;
				}

			}

		}
		return result;
	}

*/
}
	
