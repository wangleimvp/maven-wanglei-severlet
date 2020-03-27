package com.aaron.netty.chat;

/**
 * Author wanglei
 * Created on 2020-03-27
 */
public class ChatMessage {

    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ChatMessage{" +
                "content='" + content + '\'' +
                '}';
    }
}
