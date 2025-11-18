import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_2_2Test {

    @Test
    void perfectNumbers() {
        int arr1[]={6,28};
        int arr2[]={};
        int arr3[]={6};
        int arr4[]={6, 28, 496, 8128};
        int arr5[]={6,28,496};

        assertArrayEquals(arr1,Ex2_2_2.perfectNumbers(32));
        assertArrayEquals(arr2,Ex2_2_2.perfectNumbers(1));
        assertArrayEquals(arr3,Ex2_2_2.perfectNumbers(6));
        assertArrayEquals(arr4,Ex2_2_2.perfectNumbers(56767));
        assertArrayEquals(arr5,Ex2_2_2.perfectNumbers(1000));


    }
}