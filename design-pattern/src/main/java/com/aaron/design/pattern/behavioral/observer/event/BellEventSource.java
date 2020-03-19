package com.aaron.design.pattern.behavioral.observer.event;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class BellEventSource {

    private List<BellEventListener> listeners = new ArrayList<>();

    public void addPersonListener(BellEventListener listener) {
        listeners.add(listener);
    }

    public void ring(boolean sound) {
        String type = sound ? "上课铃" : "下课铃";
        System.out.println(type + "响！");
        RingEvent event = new RingEvent(this, sound);
        notifies(event);    //通知注册在该事件源上的所有监听器
    }

    public void notifies(RingEvent event) {
        for (BellEventListener listener : listeners) {
            listener.herdBell(event);
        }
    }
}
