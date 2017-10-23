package com.github.webee.msg.codec;

/**
 * Created by webee on 16/11/23.
 */

public interface Msg {
    /**
     * help method to cast current msg to it's actual type.
     * @param <T> actual msg type.
     * @return concrete msg.
     */
    <T extends Msg> T msg();
}
