package com.springinaction.chapter01.knight;

/**
 * Created by liyajin on 16/1/20.
 */
public class HolyGrailQuest implements Quest{

    public HolyGrailQuest(){}

    public HolyGrail embark(){
        System.out.println("holy grail embark");
        return new HolyGrail();
    }
}
