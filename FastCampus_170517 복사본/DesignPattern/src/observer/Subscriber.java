package observer;

/**
 * 구독자 
 * @author JunHee
 *
 */

public class Subscriber implements Observer {
	
	String name;
	
	public Subscriber(String name){
		this.name = name;
	}
	
	void showEvent(){
		System.out.println(name + "변경사항이 있습니다.");
	}

	@Override
	public void alarm() {
		showEvent();
	}
}
