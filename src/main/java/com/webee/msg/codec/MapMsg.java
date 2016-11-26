package com.webee.msg.codec;

import java.util.Map;

/**
 * Created by webee on 16/11/27.
 */

public abstract class MapMsg extends Msg {
    /**
     * msg to key/value map.
     * @return the key/value map.
     */
    public abstract Map<String, Object> toMap();

    /**
     * set msg key/value from map.
     * @param map the map to digest.
     */
    public abstract void digestMap(Map<String, Object> map);
}
