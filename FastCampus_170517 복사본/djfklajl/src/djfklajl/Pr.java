package djfklajl;

/**
 * @author JunHee
 *
 */
public class Pr {

	public static void main(String[] args) {

		boolean lee = true;
		
		int result = lee ? run(): fail();
		System.out.println(result + "");
		

		
		

		
	}
	
	public static int run(){
		return 3+3;
	}
	
	public static int fail(){
		return 4;
	}

}
