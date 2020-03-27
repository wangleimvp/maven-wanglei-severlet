package com.aaron.netty.chat;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author wanglei
 * Created on 2020-03-27
 */
public class ChatHandler extends ChannelInboundHandlerAdapter {

    Logger logger = LoggerFactory.getLogger(ChatHandler.class);

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        logger.debug("client connect success !");
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        logger.debug("channelRead: " + msg.toString());
        if (msg instanceof ChatMessage) {
            ChatMessage message = (ChatMessage) msg;
            message.setContent("服务端返回信息");
            ctx.writeAndFlush(message);
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
