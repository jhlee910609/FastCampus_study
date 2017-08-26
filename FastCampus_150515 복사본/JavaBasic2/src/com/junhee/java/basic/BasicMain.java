package com.junhee.java.basic;

// 사용하고자 하는 클래스가 다른 패키지에 있을 때는 import로 불러옴 
import com.junhee.java.basicsub.BasicSub;

public class BasicMain {
									
	// *** 코딩할 때, 중요하진 않지만 면접 문제 ***
	// 넘겨주는 값 = 아규먼트, 함수 정의할 때의 값 없는 변수 = 파라미
	// 값 불러오는 시점이 언제냐에 따라 다르다.
	// 메서드 작성 시, void plus(int x, int y) = x,y는 파라미터 (parameter)
	// 실제로 파라미터(parameter)에 대입하는 구체적인 값, 인 = 아규먼트 (argument)
	// 구체적인 차이가 좀 있지만 파라미터와 아규먼트를 통칭 '인자'라고 함.

	public static void main(String args[]) {
		
		/* ======== 조건문 ======== */
		/* ===== 1. switch문 ===== */
		
		switch ( /* 비교대상 */ ) {
		case 값1 :
			// TODO
			// break; 작성해주지 않게 될 경우, 아래 case로 계속 작업을 진행한다. 
			break;
			
		case 값2 :
			// TODO
			break;
			
		default :
			// 위의 case에 모두 해당되지 않을 경우, default 로직을 수행한다.
			break;
		}
		
		/* ===== 2. if문 ===== */
		
		int a = 3;
		int b = 4;
		
		// 1. 단순 비교 
		if (a == 3){
			System.out.println(a);
		}
		
		// 2. or 비교 
		if (a >2 || b > 3){
			System.out.println("a : " + a + ", b : " +  b);
		}
		
		//3 and 비교
		if(a>2 && b>3){
			System.out.println("a : " + a + ", b : " +  b);
		}
		
		
		/* ===== 반복문 ===== */
		/* ===== 1. for문 ===== */
		for (초기값; 반복 조건식; 증감식) {
			// 조건식 사용하지 않아도 무한루프로 실행한다. 
		}
		
		while (조건식) {
			// 조건식이 true 일 때, {} 안의 로직을 실행한다.
		}
		
		do {
			// 조건과 상관없이 초기에 한 번 실행해야하는 task가 있을 경우 사용한다.
		} while (조건식);
		
	}
}
