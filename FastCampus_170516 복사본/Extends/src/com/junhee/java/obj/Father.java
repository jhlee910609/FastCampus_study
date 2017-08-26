package com.junhee.java.obj;

// 'Cook'이라는 인터페이스를 상속함.
// 상속의 경우, 커플링(결속력)이 강해 문제가 생길 여지가 생김. 
public class Father implements Cook {

	public String lastname;
	public String name;

	public int age;
	public int money;
	public String house;
	public String car;
	public String wife;

	public void process9() {
		// 9줄의 코드
	}

	public void goDestination() {
		process9();
		System.out.println("회사를 출근합니다.");
	}

	// 인터페이스
	@Override
	public void boil() {
		// TODO Auto-generated method stub

	}

	@Override
	public void grill() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fry() {
		// TODO Auto-generated method stub

	}

	@Override
	public void oven() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stea() {
		// TODO Auto-generated method stub

	}

	@Override
	public void disassemble() {
		System.out.println("분해하였습니다.");

	}

	@Override
	public void replacePart() {
		System.out.println("교체 3번 하였습니다.");

	}

	@Override
	public void clean() {
		System.out.println("청소하였습니다.");
	}

	@Override
	public void assemble() {
		System.out.println("조립하였습니다.");
	}

	// 상속 시키고 싶지 않다면 private 을 걸어주면 됨.
	// 접근 제한자를 private으로 걸어줄 경우, 코드블럭{} 안에서만 호출할 수 있음.
}
