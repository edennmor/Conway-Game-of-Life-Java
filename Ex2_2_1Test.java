import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_2_1Test {

    @Test
    void isPerfect() {

        assertEquals(true, Ex2_2_1.isPerfect(28));
        assertEquals(false, Ex2_2_1.isPerfect(8));
        assertEquals(false, Ex2_2_1.isPerfect(0));
        assertEquals(false, Ex2_2_1.isPerfect(-8));
        assertEquals(true, Ex2_2_1.isPerfect(6));

    }
}