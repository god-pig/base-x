package org.godpig.convert.basex;

import org.godpig.convert.BaseCodec;

/**
 * @author litao litaoh@aliyun.com
 */
public class BaseXCodec extends BaseCodec<byte[], String> {
    public static final String BASE_2 = "01";
    public static final String BASE_8 = "01234567";
    public static final String BASE_11 = "0123456789a";
    public static final String BASE_16 = "0123456789abcdef";
    public static final String BASE_32 = "0123456789ABCDEFGHJKMNPQRSTVWXYZ";
    public static final String Z_BASE_32 = "ybndrfg8ejkmcpqxot1uwisza345h769";
    public static final String BASE_36 = "0123456789abcdefghijklmnopqrstuvwxyz";
    public static final String BASE_58 = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";
    public static final String BASE_62 = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String BASE_64 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    public static final String BASE_66 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_.!~";
    public BaseXCodec(String alphabet) throws Exception {
        encoder = new BaseXEncoder(alphabet);
        decoder = new BaseXDecoder(alphabet);
    }
}
