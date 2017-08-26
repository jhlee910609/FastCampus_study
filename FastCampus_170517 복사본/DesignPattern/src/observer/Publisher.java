package observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Publisher {
	// Observer 저장소
	// 동기화를 내부적으로 
	// 거의 쓸 일이 없다고 보면 됨 
	List<Observer> observers = new CopyOnWriteArrayList<>();
	
	// Observer 추가하기
	public void addObserver(Observer obs){
		observers.add(obs);
	}
	
	// 자체 처리함수... 
	public void process(){
		// 처리...
		// 이벤트 발생 시...
		while(true){
						
				notice();
				try{
				Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		
	}
	
	private void notice(){
		for(Observer observer : observers){
			observer.alarm();
		}
	}
}
