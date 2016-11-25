package com.webee.msg.codec;

/**
 * Created by webee on 16/11/24.
 */

public abstract class AbstractMsg implements Msg {
    @Override
    public <T extends Msg> T msg() {
        return (T)this;
    }
}
