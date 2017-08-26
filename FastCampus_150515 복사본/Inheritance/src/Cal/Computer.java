package Cal;
						// [extends "상속할 클래스"]를 통해 클래스 상속을 수행한다
public class Computer extends Calculator {
	
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	};
}


