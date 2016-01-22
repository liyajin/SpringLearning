package com.springinaction.chapter02.springido1;

import java.util.Collection;
import java.util.Map;

/**
 * Created by liyajin on 16/1/21.
 */
public class OneManBand implements Performer {

    public OneManBand(){}

    public Map<String,Instrument> instruments;

    public void setInstruments(Map<String,Instrument> instruments) {
        this.instruments = instruments;
    }

    public void perform() {
        for(String key: instruments.keySet()){
            System.out.print(key + ": ");
            instruments.get(key).play();
        }
    }
}
