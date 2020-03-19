package com.aaron.design.pattern.behavioral.observer.event;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class StuEventListener implements BellEventListener {
    @Override
    public void herdBell(RingEvent ringEvent) {
        if(ringEvent.getSound())
        {
            System.out.println("同学们，上课了...");
        }
        else
        {
            System.out.println("同学们，下课了...");
        }
    }
}
