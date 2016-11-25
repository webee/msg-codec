package com.webee.msg.codec;

/**
 * Created by webee on 16/11/23.
 */

public interface Msg {
    int type();
    <T extends Msg> T msg();
}
