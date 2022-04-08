package com.java.day03;

import java.util.ArrayList;

public class Sample4 implements Runnable {
    int seq;
    public Sample4(int seq) {
        this.seq = seq;
    }

    public void run() {
        System.out.println(this.seq+" thread start.");
        try {
            Thread.sleep(1000);
        }catch(Exception e) {
        }
        System.out.println(this.seq+" thread end.");
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads =new ArrayList<>();
        for(int i=0; i<10; i++) {
            Thread t =new Thread(new Sample4(i));
            t.start();
            threads.add(t);
        }

        for(int i=0; i<threads.size(); i++) {
            Thread t = threads.get(i);
            try {
                t.join();   // 쓰레드가 종료될 때까지 기다린다.
            }catch(Exception e) {
            }
        }
        System.out.println("main end.");
    }
}

