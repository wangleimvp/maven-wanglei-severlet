package com.aaron.netty.chat;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import io.netty.util.internal.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author wanglei
 * Created on 2020-03-27
 */
public class ChatEncoder extends MessageToByteEncoder<ChatMessage> {

    Logger logger = LoggerFactory.getLogger(ChatEncoder.class);

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, ChatMessage chatMessage,
                          ByteBuf byteBuf) throws Exception {
        logger.debug("encode: " + chatMessage.toString());
        if (!StringUtil.isNullOrEmpty(chatMessage.getContent())) {
            byteBuf.writeBytes(chatMessage.getContent().getBytes());
        }
    }
}
