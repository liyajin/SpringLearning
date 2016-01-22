package com.springinaction.chapter02.springido1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.misc.Perf;

/**
 * Created by liyajin on 16/1/20.
 */
public class springidoApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springidol.xml");
//        Performer duke = (Performer) context.getBean("duke");
        Performer kenny = (Performer) context.getBean("Kenny");
//        Performer hank = (Performer) context.getBean("hank");
//        duke.perform();
        kenny.perform();
        System.out.println("-----");
//        hank.perform();
    }
}
