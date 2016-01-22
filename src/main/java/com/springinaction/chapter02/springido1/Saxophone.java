package com.springinaction.chapter02.springido1;

/**
 * Created by liyajin on 16/1/20.
 */
public class Saxophone implements Instrument {

    public Saxophone(){}

    public void play() {
        System.out.println("Saxophone: TOOT, TOOT");
    }

    public void tune() {
        System.out.println("Saxophone: tune");
    }

    public void clean() {
        System.out.println("Saxophone: clean");
    }
}
