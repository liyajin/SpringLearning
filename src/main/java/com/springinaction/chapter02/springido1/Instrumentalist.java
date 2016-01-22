package com.springinaction.chapter02.springido1;

/**
 * Created by liyajin on 16/1/20.
 */
public class Instrumentalist implements Performer {

    private String song;
    private Instrument instrument;

    public Instrumentalist(){}


    public void perform() {
        System.out.println("playing " + song + ": ");
        instrument.play();
    }

    public void setSong(String song) {
        this.song = song;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

    public void tuneInstrument(){
        instrument.tune();
    }

    public void cleanInstrument(){
        instrument.clean();
    }
}
