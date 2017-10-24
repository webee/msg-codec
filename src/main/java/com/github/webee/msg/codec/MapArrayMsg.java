package com.github.webee.msg.codec;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by webee on 16/11/27.
 */
public abstract class MapArrayMsg extends AbstractMsg implements MapX, ArrayX {
    @Override
    public Map<String, Object> toMap() {
        return new HashMap<>();
    }

    @Override
    public MapArrayMsg digestMap(Map<String, Object> map) {
        return this;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public MapArrayMsg digestArray(Object[] array) {
        return this;
    }
}
