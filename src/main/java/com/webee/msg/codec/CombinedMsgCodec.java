package com.webee.msg.codec;

/**
 * Created by webee on 16/11/24.
 */

public class CombinedMsgCodec<T> implements MsgCodec<T> {
    private final MsgCodec<T>[] codecs;

    public CombinedMsgCodec(MsgCodec<T> ...codecs) {
        this.codecs = codecs;
    }

    @Override
    public T encode(Msg msg) {
        for (MsgCodec<T> codec : codecs) {
            T s = codec.encode(msg);
            if (s != null) {
                return s;
            }
        }
        return null;
    }

    @Override
    public Msg decode(T msg) {
        for (MsgCodec<T> codec : codecs) {
            Msg m = codec.decode(msg);
            if (m != null) {
                return m;
            }
        }
        return null;
    }
}