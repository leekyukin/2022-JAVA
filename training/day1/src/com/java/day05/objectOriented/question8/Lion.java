package com.java.day05.objectOriented.question8;

class Lion extends Animal implements Predator {
	public static void main(String[] args) {
        Animal a =new Animal();  // 1번
        Animal b =new Dog();  // 2번
        Animal c =new Lion();  // 3번
//        Dog d =new Animal();  // 4번
// 		자식클레스가 부모클레스에 다형성을 적용해줄 수는 없다.
        Predator e =new Lion();  // 5번
	}
}

