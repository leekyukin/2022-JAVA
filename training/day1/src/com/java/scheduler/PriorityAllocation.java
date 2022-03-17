package com.java.scheduler;

public class PriorityAllocation implements Scheduler {

    @Override
    public void getNextCall() {
        System.out.println("고객 등급에 따라 우선적으로 처리.");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("업무 스킬값이 높은 상담원에게 우선 배분");
    }
}