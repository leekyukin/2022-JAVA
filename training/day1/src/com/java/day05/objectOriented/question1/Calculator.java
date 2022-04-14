package com.java.day05.objectOriented.question1;

public class Calculator {

	int value;
	
	Calculator() {
		this.value = 0;
	}
	
	void add(int val) {
		this.value += val;
	}
	
	int getValue() {
		return value;
	}
}
