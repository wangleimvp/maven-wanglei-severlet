package com.aaron.netty.live;

import io.netty.channel.Channel;
import io.netty.util.concurrent.ScheduledFuture;

/**
 * Author wanglei
 * Created on 2020-03-26
 */
public class LiveChannelCache {

    private Channel channel;

    private ScheduledFuture scheduledFuture;

    public LiveChannelCache(Channel channel, ScheduledFuture scheduledFuture){
        this.channel = channel;
        this.scheduledFuture = scheduledFuture;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public ScheduledFuture getScheduledFuture() {
        return scheduledFuture;
    }

    public void setScheduledFuture(ScheduledFuture scheduledFuture) {
        this.scheduledFuture = scheduledFuture;
    }
}
