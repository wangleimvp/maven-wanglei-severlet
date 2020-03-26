package com.aaron.netty.live;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.internal.StringUtil;

/**
 * Author wanglei
 * Created on 2020-03-26
 */
public class LiveEncoder extends MessageToByteEncoder<LiveMessage> {
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, LiveMessage liveMessage,
                          ByteBuf byteBuf) throws Exception {
        byteBuf.writeByte(liveMessage.getType());
        byteBuf.writeInt(liveMessage.getLength());
        if (!StringUtil.isNullOrEmpty(liveMessage.getContent())) {
            byteBuf.writeBytes(liveMessage.getContent().getBytes());

        }
    }
}
