package com.github.webee.msg.codec;

import java.util.Map;

/**
 * Created by webee on 16/11/27.
 */

public interface MapX {
    /**
     * msg to key/value map.
     * @return the key/value map.
     */
    Map<String, Object> toMap();

    /**
     * set msg key/value from map.
     * @param map the map to digest.
     */
    void digestMap(Map<String, Object> map);
}
