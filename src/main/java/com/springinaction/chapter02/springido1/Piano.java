package com.springinaction.chapter02.springido1;

/**
 * Created by liyajin on 16/1/20.
 */
public class Piano implements Instrument {

    public Piano(){}

    public void play() {
        System.out.println("Piano: PLINK, PLINK");
    }

    public void tune() {
        System.out.println("Piano: tune");
    }

    public void clean() {
        System.out.println("Piano: clean");
    }
}
