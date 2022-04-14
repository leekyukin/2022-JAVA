package com.java.day05.objectOriented.question7;

class MineralCalculator {
	int value = 0;

	public void add(Gold gold) {
        this.value += 100;
    }

	public void add(Silver silver) {
        this.value += 90;
    }

	public void add(Bronze bronze) {
        this.value += 80;
    }

	public int getValue() {
		return this.value;
    }

	public static void main(String[] args) {
        MineralCalculator cal =new MineralCalculator();
        cal.add(new Gold());
        cal.add(new Silver());
        cal.add(new Bronze());
        System.out.println(cal.getValue());  // 270 출력
	}
}

