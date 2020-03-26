package com.aaron.netty.live;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Author wanglei
 * Created on 2020-03-26
 */
public class LiveDecoder extends ReplayingDecoder<LiveDecoder.LiveState> {

    Logger logger = LoggerFactory.getLogger(LiveDecoder.class);

    public enum LiveState { //2
        TYPE,
        LENGTH,
        CONTENT
    }

    private LiveMessage message = new LiveMessage();

    public LiveDecoder() {
        super(LiveState.TYPE); // 3
    }

    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext,
                          ByteBuf byteBuf, List<Object> list) throws Exception {
        switch (state()) { // 4
            case TYPE:
                message = new LiveMessage();
                byte type = byteBuf.readByte();
                logger.debug("type:" + type);
                message.setType(type);
                checkpoint(LiveState.LENGTH);
                break;
            case LENGTH:
                int length = byteBuf.readInt();
                //TODO: 自己添加的
                message.setLength(length);
                if (length > 0) {
                    checkpoint(LiveState.CONTENT); // 5
                } else {
                    list.add(message); // 6
                    checkpoint(LiveState.TYPE);
                }
                break;
            case CONTENT:
                byte[] bytes = new byte[message.getLength()];
                byteBuf.readBytes(bytes);
                String content = new String(bytes);
                message.setContent(content);
                list.add(message);
                checkpoint(LiveState.TYPE);
                break;
            default:
                throw new IllegalStateException("invalid state:" + state());
        }
    }
}