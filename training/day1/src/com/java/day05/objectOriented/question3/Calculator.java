package com.java.day05.objectOriented.question3;

class Calculator {
	int value;

    Calculator() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

	int getValue() {
		return this.value;
    }
	
	boolean isOdd(int val) {
		if(val % 2 == 0) 
			return false;
		else 
			return true;
	}
}
