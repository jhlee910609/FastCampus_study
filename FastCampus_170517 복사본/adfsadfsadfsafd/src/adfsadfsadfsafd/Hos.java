package adfsadfsadfsafd;

public class Hos {

	public static void main(String[] args) {

		
		init();
		
	}

	private static void init() {
		Hospital hospital = new Hospital();
	
		
		
		Job[] Job =

		// 의사 3 명, 환자 21 명, 간호사 7 명
		Doctor[] doctor = new Doctor[3];
		
		
		for (int i = 0; i < doctor.length; i++) {
			doctor[i] = new Doctor();
			doctor[i].setName("의사 : " + (i + 1));
		}
		
		
		
		
		Nurse[] nurse = new Nurse[7];
		for (int i = 0; i < nurse.length; i++) {
			nurse[i] = new Nurse();
			nurse[i].setName("간호사 : " + (i + 1));
		}
		
		Patient[] patient = new Patient[21];
		for (int i = 0; i < patient.length; i++) {
			patient[i] = new Patient();
			patient[i].setName("환자 : " + (i + 1));
		}
		
		


		

		

		
		
	}
}
