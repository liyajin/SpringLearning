package com.springinaction.chapter02.springido1;

/**
 * Created by liyajin on 16/1/20.
 */
public class Sonnet29 implements Poem {

    private static String[] LINES = {"When I was young, ","I like playing. "};

    public Sonnet29(){}

    public void recite() {
        for(int i = 0; i < LINES.length; i++) System.out.println(LINES[i]);
    }
}
