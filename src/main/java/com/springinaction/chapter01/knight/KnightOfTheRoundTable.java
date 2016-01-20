package com.springinaction.chapter01.knight;

import junit.framework.TestCase;

/**
 * Created by liyajin on 16/1/20.
 */
public class KnightOfTheRoundTable implements Knight{

    private String name;
    private Quest quest;

    public KnightOfTheRoundTable(){}

    public KnightOfTheRoundTable(String name){
        this.name = name;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    public Object embarkOnQuest(){
        return quest.embark();
    }

    public String getName() {
        return name;
    }

}
