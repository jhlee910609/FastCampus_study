package StringExam2;

public class StringExam2 {
	
	public int search(int limitNum, int searchNum) {

		String strSearch = searchNum + "";
		int count = 0;

		for (int i = 1; i <= limitNum; i++) {

			String temp = i + "";

			int temp_length = temp.length();
			for (int j = 0; j < temp_length; j++) {

				char each = temp.charAt(j);
				if (strSearch.equals(each)) {
					count = count + 1;
				}			
			}
		}
		return count;
		
		

		// 10000까지 수에서 각 수 마다 총 8의 개수

	}


	public static void main(String[] args) {
		
		StringExam2 exam = new StringExam2();
		
		System.out.println("8의 개수는" + exam.search(10000, 8));
	}

}
