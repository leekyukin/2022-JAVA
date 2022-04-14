package com.java.day05.objectOriented.question2;

public class MaxLimitCalculator extends Calculator {
	
	boolean limitCheck(int val) {
		if(this.value + val > 100) 
			return false;
		return true;
	}
	
	@Override
	void add(int val) {
		if(limitCheck(val))
			super.add(val);
		else System.out.println("I'm so sorry but i love you 다 거짓말~!");
	}
	
	public static void main(String[] args) {
		MaxLimitCalculator cal = new MaxLimitCalculator();
		cal.add(50);  // 50 더하기
		cal.add(60);  // 60 더하기
		System.out.println(cal.getValue());  // 100 출력
	}
}
