package com.github.webee.msg.codec;

/**
 * Created by webee on 16/11/27.
 */
public abstract class ArrayMsg extends AbstractMsg implements ArrayX {
    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public ArrayMsg digestArray(Object[] array) {
        return this;
    }
}
