package com.aaron.design.pattern.behavioral.observer.event;

/**
 * Author wanglei
 * Created on 2020-03-19
 */
public class RingEvent extends EventObject {

    private boolean sound;

    public RingEvent(Object source, boolean sound){
        super(source);
        this.sound = sound;
    }

    public boolean getSound() {
        return sound;
    }

    public void setSound(boolean sound) {
        this.sound = sound;
    }
}
