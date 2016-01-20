package com.springinaction.chapter01.knight;

import java.util.logging.Logger;

/**
 * Created by liyajin on 16/1/20.
 */
public class Minstrel {
    private static final Logger SONG = Logger.getLogger("Minstrel.class");

    public void singBefore(Knight knight){
        SONG.info("Fa la la la, " + knight.getName() + " is so brave");
    }

    public void singAfter(Knight knigh){
        SONG.info("Ha ha ha ha, " + knigh.getName() + " did embark on a quest");
    }
}
