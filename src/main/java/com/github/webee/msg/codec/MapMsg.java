package com.github.webee.msg.codec;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by webee on 16/11/27.
 */
public abstract class MapMsg extends AbstractMsg implements MapX {
    @Override
    public Map<String, Object> toMap() {
        return new HashMap<>();
    }

    @Override
    public void digestMap(Map<String, Object> map) {
    }
}
