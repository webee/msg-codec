package com.github.webee.msg.codec;

/**
 * User: webee
 * Date: 17/10/23
 * Time: 下午11:05
 */
public interface Codec<S, T> {
    /**
     * encode s(S) to t(T)
     * @param s object(S) to encode
     * @return encoded object(T), null if failed to encode.
     */
    T encode(S s);

    /**
     * decode s(S) from t(T)
     * @param t object(T) to decode
     * @return decoded object(S), null if failed to decode.
     */
    S decode(T t);
}
