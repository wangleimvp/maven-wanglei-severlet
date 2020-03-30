package com.aaron.netty.chat;

import com.aaron.netty.live.LiveChannelCache;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.ScheduledFuture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Author wanglei
 * Created on 2020-03-27
 */
public class ChatHandler extends ChannelInboundHandlerAdapter {

    Logger logger = LoggerFactory.getLogger(ChatHandler.class);

    private static Map<Integer, LiveChannelCache> channelCache = new HashMap<>();

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        logger.debug("client connect success !");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {

        Channel channel = ctx.channel();
        final int hashCode = channel.hashCode();
        logger.debug("channel hashCode:" + hashCode + " msg:" + msg.toString() + " cache:" + channelCache.size());

        if (!channelCache.containsKey(hashCode)){
            logger.debug("channelCache.containsKey(hashCode), put key:" + hashCode);
            channel.closeFuture().addListener(future -> {
                logger.debug("channel close, remove key:" + hashCode);
                channelCache.remove(hashCode);
            });
            ScheduledFuture scheduledFuture = ctx.executor().schedule(
                    () -> {
                        logger.debug("schedule runs, close channel:" + hashCode);
                        channel.close();
                    }, 10, TimeUnit.SECONDS);
            channelCache.put(hashCode, new LiveChannelCache(channel, scheduledFuture));
        }
        if (msg instanceof ChatMessage) {
            ChatMessage message = (ChatMessage) msg;
            message.setContent("服务端返回信息");
            channelCache.forEach((key, value) -> {
                Channel otherChannel = value.getChannel();
                otherChannel.writeAndFlush(message);
            });
//            ctx.writeAndFlush(message);
        } else {
            throw new Exception();
        }
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        logger.debug("channelReadComplete");
        super.channelReadComplete(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.debug("exceptionCaught");
        if (null != cause) cause.printStackTrace();
        if (null != ctx) ctx.close();
    }

}
