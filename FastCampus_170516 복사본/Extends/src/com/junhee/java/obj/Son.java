package com.junhee.java.obj;
// 일반 상속은 다중상속이 되지 않지만 인터페이스를 사용하게 되면 다중상속이 가능함. 
public class Son extends Father {
	public String wife;
	public String girlfriend;
	
	@Override
	public void process9() {
		
	}
	
	
	
	public void goDestination() {
		// TODO Auto-generated method stub
		super.process9();  // 부모 객체의 것 'super.' 붙혀 줘야함.
		process9(); // 현재 객체의 것  
		
		System.out.println("PC방을 갑니다.");
	}
	// <--- overload ---> 
	public void process9(int aaa) {
		
	}
	
	public void process9(String a) {
		
	}
	
	

	
	/*
	 * --- Father의 클래스 멤버 default 호출 ---
	 * public String lastname; public String name;
	 * 
	 * public int age; public int money; public String house; public String car;
	 * public String wife;
	 * 
	 */

}
