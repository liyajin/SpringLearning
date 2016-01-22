package com.springinaction.chapter02.springido1;

/**
 * Created by liyajin on 16/1/20.
 */
public class PoeticJuggler extends Juggler {

    private Poem poem;

    public PoeticJuggler(Poem poem){
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem){
        super(beanBags);
        this.poem = poem;
    }

    public void perform(){
        super.perform();
        System.out.println("while reciting...");
        poem.recite();
    }
}
