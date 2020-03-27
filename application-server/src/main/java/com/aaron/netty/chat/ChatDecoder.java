package com.aaron.netty.chat;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Author wanglei
 * Created on 2020-03-27
 */
public class ChatDecoder extends ByteToMessageDecoder {

    Logger logger = LoggerFactory.getLogger(ChatDecoder.class);

    private ChatMessage message = new ChatMessage();

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        byte[] bytes = new byte[21];
        byteBuf.readBytes(bytes);
        String content = new String(bytes);
        logger.debug("decode: " + content);
        message.setContent(content);
        list.add(message);
    }
}
