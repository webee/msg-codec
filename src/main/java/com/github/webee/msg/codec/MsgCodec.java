package com.github.webee.msg.codec;

/**
 *
 * Created by webee on 16/11/23.
 */

public interface MsgCodec<T> {
    /**
     * encode msg(Msg) to msg(T)
     * @param msg msg(Msg) to encode
     * @return encoded msg(T), null if failed to encode.
     */
    T encode(Msg msg);

    /**
     * decode msg(Msg) from msg(T)
     * @param msg msg(T) to decode
     * @return decoded msg(Msg), null if failed to decode.
     */
    Msg decode(T msg);
}