package com.springinaction.chapter02.springido1;

/**
 * Created by liyajin on 16/1/21.
 */
public class Stage {

    public Stage(){}

    private static class StageSingleHolder{
        static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingleHolder.instance;
    }
}
