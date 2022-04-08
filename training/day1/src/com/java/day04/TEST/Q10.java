package com.java.day04.TEST;

import java.util.HashMap;

public class Q10 {
    static void printCoffeePrice(int type) {
        HashMap<Integer, Integer> priceMap =new HashMap<>();
        priceMap.put(1, 3000);  // 1: 아메리카노
        priceMap.put(2, 4000);  // 2: 아이스 아메리카노
        priceMap.put(3, 5000);  // 3: 카페라떼
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }
    public static void main(String[] args) {
        printCoffeePrice(1);  // "가격은 3000원 입니다." 출력
        printCoffeePrice(99);  // NullPointerException 발생
    }


}
