package com.github.webee.msg.codec;

/**
 * Created by webee on 16/11/30.
 */
public class AbstractMsg implements Msg {
    public <T extends Msg> T msg() {
        return (T)this;
    }
}
