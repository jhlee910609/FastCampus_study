package com.junhee.lang.java;

import com.junhee.lang.java.PatternMain.Singleton;

public class Singleton {
	
		// 어느 상황에 적용하느냐에 따라 싱글턴 패턴의 로직이 달라진다.. 
		// 디비 같은 경우는 아래 싱글턴으로 사용할 수 없음
		// 왜냐면 시스템 자원인 context가 필요하기 때문에,main이 new가 된 후에 사용할 수 있음 
		
		// 3, 자기 자신을 담아두는 저장공간을 만들고 
		private static Singleton instance = new Singleton();
		
		// 1. 생성자를 private 으로 ㅁ나들어 외부에서 생성할 수 없도록 제한한다. 
		private Singleton(){
		 // 로직 없음 	
		}
		
		// 2. 외부에서 생성할 수 없으므로
		// 내부에서 생성한 후 사용할 수 있도록 인터페이스를 제공하고,
		// 외부에서 new가 안되므로 함수는 static으로 구성해야 한다.
		public static Singleton getInstance(){
		
			return instance;
		}
}	


