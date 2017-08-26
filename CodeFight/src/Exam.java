
public class Exam {

	public static void main(String[] args) {
		
		Exam myRide = new Exam();
		myRide.lateRide(808);
	}
	
	public int lateRide(int n){
		
		int hour = n/60;
		int min = n%60;
		int result = 0;
		
		String strHour = Integer.toString(hour);
		String strMin = Integer.toString(min);
		
		String[] hh = strHour.split("");
		String[] mm = strHour.split("");
		
		for(int i = 0; i < hh.length; i++) {
			String sum = hh[i] + mm[i];
			result = Integer.valueOf(sum);
		}
		return result;		
	}
}
