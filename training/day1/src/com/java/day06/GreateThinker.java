package com.java.day06;

import java.util.ArrayList;

public class GreateThinker extends Disciple {

    ArrayList<Disciple> disciples = new ArrayList<>();
    String god;

    public GreateThinker(
            ArrayList<Disciple> disciples, String god, String name, Religion religion
    ) {
        super(name, name, religion);
        this.disciples = disciples;
        this.god = god;
    };


    @Override
    public void receiveRevelation() {
        System.out.println("Greate thinker " + name + "이 " + god + "에게 계시를 받습니다.");
    }

    public void prayToGod() {
        System.out.println("Greate thinker " + name + "이 " + god + "에게 기도합니다.");
    }

}
