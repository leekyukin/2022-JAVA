package com.java.day05.objectOriented.question4;

import java.util.ArrayList;
import java.util.Arrays;

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
	
	int avg(ArrayList<Integer> list) {
		int sum = 0;
		for(Integer num : list) 
			sum += num;
		
		return sum / list.size();
	}
	
	int avg(int[] arr) {
		int sum = 0;
		for(Integer num : arr) 
			sum += num;
		
		return sum / arr.length;
	}
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 7, 9};
		Calculator cal =new Calculator();
		int result = cal.avg(arr);
		System.out.println(result);  // 5 출력

		ArrayList<Integer> list =new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
		result = cal.avg(list);
		System.out.println(result);  // 5 출력

	}
}

