package io.khasang.demo.model;

public class Hello {
    private String messageInfo;

    public Hello(String messageInfo) {
        this.messageInfo = messageInfo;
    }

    public Hello() {
    }

    public String getMessageInfo() {
        return messageInfo;
    }

    public void setMessageInfo(String messageInfo) {
        this.messageInfo = messageInfo;
    }
}
