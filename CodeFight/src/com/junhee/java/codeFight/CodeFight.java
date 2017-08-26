package com.junhee.java.codeFight;

import java.util.ArrayList;
import java.util.HashMap;

import com.junhee.java.dummy.Student;

public class CodeFight {

	public static void main(String[] args) {

	}

	public int circleOfNumbers(int n, int firstNumber) {
	 
		int avg = n/2;
		int pair;
		
		
		if ( firstNumber < avg) {
			pair = firstNumber + avg;
			
						
	    	
	    } else {
	    	pair = firstNumber - avg;
	    	
	    }
	    return pair;
	    	
	}
}
