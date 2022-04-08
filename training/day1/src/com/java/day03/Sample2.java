package com.java.day03;

public class Sample2 extends Thread {
    int seq;

    public Sample2(int seq) {
        this.seq = seq;
    }


    @Override
    public void run() {
        System.out.println(this.seq + " Thread start.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.seq + "Thread end.");
    }

    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Sample2 t = new Sample2(i);
            t.start();
        }
        System.out.println("main end.");
    }
}
