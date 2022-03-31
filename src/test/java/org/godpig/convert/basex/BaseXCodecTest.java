package org.godpig.convert.basex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BaseXCodecTest {

    private static final BaseXCodec base58 = new BaseXCodec(BaseXCodec.BASE_58);

    private final String encoded = "TcASfmyoFiNobNaCHeiPMkWgGmovoxk1sqk";
    private final byte[] bytes = new byte[]{14, -5, 24, -36, -54, -21, 97, -24, 85, -27, 109, -68, 53, -110, 43, 36, -10, -18, 110, 55, -54, -93, -96, 123, -87, 35};


    @Test
    void base58Encode() throws Exception {
        assertEquals(base58.encode(bytes), encoded);
    }

    @Test
    void base58Decode() throws Exception {
        assertArrayEquals(base58.decode(encoded), bytes);
    }
}
