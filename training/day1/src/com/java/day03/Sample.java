package com.java.day03;

public class Sample extends Thread {
    @Override
    public void run() { // Thread 를 상속하면 run 메소드를 구현해야 한다.
        System.out.println("Thread run.");
    }

    public static void main(String[] args) {
        Sample sample = new Sample();
        sample.start();    // start 로 쓰레드를 실행한다.
    }
}
