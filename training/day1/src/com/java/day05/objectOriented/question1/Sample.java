package com.java.day05.objectOriented.question1;

public class Sample {
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(10);
		System.out.println(cal.getValue());
		
		UpgradeCalculator UCalc = new UpgradeCalculator();
		UCalc.add(10);
		UCalc.minus(3);
		System.out.println(UCalc.getValue());
	}
}
