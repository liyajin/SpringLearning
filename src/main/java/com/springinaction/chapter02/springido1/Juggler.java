package com.springinaction.chapter02.springido1;

/**
 * Created by liyajin on 16/1/20.
 */
public class Juggler implements Performer{

    private int beanBags = 3;

    public Juggler(){}

    public Juggler(int beanBags){
        this.beanBags = beanBags;
    }

    public void perform() {
        System.out.println("Juggling " + beanBags + " bean bags");
    }
}
