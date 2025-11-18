import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_4_1Test {

    @Test
    void hex2Dec() {
        assertEquals(11,Ex2_4_1.hex2Dec("B"));
        assertEquals(0,Ex2_4_1.hex2Dec("0000"));
        assertEquals(-1,Ex2_4_1.hex2Dec("-1243"));
        assertEquals(41719,Ex2_4_1.hex2Dec("A2F7"));
        assertEquals(4132,Ex2_4_1.hex2Dec("1024"));

    }
}