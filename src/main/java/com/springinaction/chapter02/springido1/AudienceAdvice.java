package com.springinaction.chapter02.springido1;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

import java.lang.reflect.Method;

/**
 * Created by liyajin on 16/1/26.
 */
public class AudienceAdvice implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {

    public AudienceAdvice(){}

    private Audience audience;


    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        audience.applaud();
    }

    public void before(Method method, Object[] objects, Object o) throws Throwable {
        audience.takeSeats();
        audience.turnOffCellPhone();
    }

    public void afterThrowing(Throwable throwable){
        audience.demandRefund();
    }

    public void setAudience(Audience audience) {
        this.audience = audience;
    }
}
