import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * Author wanglei
 * Created on 2020-03-26
 */
public class NettySocket {

    private Logger logger = LoggerFactory.getLogger(NettySocket.class);

    private SocketAddress address = new InetSocketAddress("localhost",9090);

    /**
     *  Socket使用方式
     */
    @Test
    public void testSocket() throws Exception {
        logger.debug("start");
        Socket socket = new Socket();
        socket.connect(address);
        //LiveMessage 是 自定义协议内容，需要 byte, int, String
        // byte 不好处理 int,String
//         byte[] output = new byte[]{1, 0};
        ByteBuffer byteBuffer = ByteBuffer.allocate(5);
        byteBuffer.put((byte) 1);
        byteBuffer.putInt(0);
        socket.getOutputStream().write(byteBuffer.array());
        byte[] input = new byte[64];
        int readByte = socket.getInputStream().read(input);
        logger.debug("readByte " + readByte);
        for (int i = 0; i < readByte; i++) {
            logger.debug("read [" + i + "]:" + input[i]);
        }
        socket.close();
    }

    /**
     *  SocketChannel blocking
     */
    @Test
    public void testSocketChannelBlock() throws Exception {
        final SocketChannel channel = SocketChannel.open(address);
        ByteBuffer output = ByteBuffer.allocate(5);
        output.put((byte) 1);
        output.putInt(0);
        output.flip();
        channel.write(output);
        logger.debug("write complete, start read");
        ByteBuffer input = ByteBuffer.allocate(5);
        int readByte = channel.read(input);
        logger.debug("readByte " + readByte);
        input.flip();
        if (readByte == -1) {
            logger.debug("readByte == -1, return!");
            return;
        }
        for (int i = 0; i < readByte; i++) {
            logger.debug("read [" + i + "]:" + input.get());
        }
    }

    /**
     *  SocketChannel non-blocking
     */
    @Test
    public void testSocketChannelConcurrent() throws Exception {
        final SocketChannel channel = SocketChannel.open(address);
        Selector selector = Selector.open();
        // 设置channel为非阻塞模式
        channel.configureBlocking(false);
        // 想Selector注册read消息,一旦可以read了,就会通知到SocketChannel
        channel.register(selector, SelectionKey.OP_READ);

        ByteBuffer output = ByteBuffer.allocate(5);
        output.put((byte) 1);
        output.putInt(0);
        // 写完数据之后记得调用flip(),否则索引不对,数据会写不进去
        output.flip();
        channel.write(output);
        logger.debug("write complete, start read");
        while (true) {
            // selectNow()是立即返回结果的
            if (selector.selectNow() > 0) {
                // 拿到所有已经Ready的keys,通过keys可以拿到对应的channel
                Set<SelectionKey> selectionKeys = selector.selectedKeys();
                logger.debug("start iterator keys, size:{}", selectionKeys.size());
                Iterator<SelectionKey> keyIterator = selectionKeys.iterator();
                while (keyIterator.hasNext()) {
                    SelectionKey key = keyIterator.next();
                    if (key.isReadable()) {
                        logger.debug("key.isReadable(), startRead");
                        ByteBuffer input = ByteBuffer.allocate(64);
                        // 通过key.channel()可以拿到channel,需要进行下一步操作的话需要做一下强制转换
                        SocketChannel keyChannel = (SocketChannel) key.channel();
                        int readByte = keyChannel.read(input);
                        logger.debug("readByte " + readByte);
                        // 同样,read完成之后记得flip(),因为这里的read相当于往buffer里面写了数据进去，否则读不出数据
                        input.flip();
                        if (readByte == -1) {
                            logger.debug("readByte == -1, return!");
                            return;
                        }
                        for (int i = 0; i < readByte; i++) {
                            logger.debug("read [" + i + "]:" + input.get());
                        }
                    }
                    // 遍历结束之后记得删除key,否则key会一直存在于selector.selectedKeys()
                    keyIterator.remove();
                }
                break;
            } else {
                logger.debug("sleep(1000)");
                Thread.sleep(1000);
            }
        }
    }
}
