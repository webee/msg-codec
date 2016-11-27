package com.webee.msg.codec;

/**
 * Created by webee on 16/11/27.
 */

public interface ArrayX {
    /**
     * msg to value array.
     * @return the value array.
     */
    Object[] toArray();

    /**
     * set value from array.
     * @param array the array to digest.
     * @return digest count.
     */
    int digestArray(Object[] array);
}
