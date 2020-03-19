package com.aaron.design.pattern.behavioral.observer.event;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public interface BellEventListener extends EventListener {

    void herdBell(RingEvent ringEvent);
}
