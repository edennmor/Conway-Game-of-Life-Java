import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_4_2Test {

    @Test
    void dec2Hex() {
        String str1="162E";
        String str2="C";
        String str3="0000";
        String str4="10";
        String str5="B";


        assertEquals(str1,Ex2_4_2.dec2Hex(5678));
        assertEquals(str2,Ex2_4_2.dec2Hex(12));
        assertEquals(str3,Ex2_4_2.dec2Hex(0));
        assertEquals(str4,Ex2_4_2.dec2Hex(16));
        assertEquals(str5,Ex2_4_2.dec2Hex(11));

    }
}