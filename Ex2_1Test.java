import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_1Test {

    @Test
    void primeDividers() {
        int arr[]={2,2,2,3,3};
        int arr2[]={-1};
        int arr4[]={-1};
        int arr3[]={2,2,7,11,13};
        int arr5[]={2};


        assertArrayEquals(arr,Ex2_1.primeDividers(72));
        assertArrayEquals(arr2,Ex2_1.primeDividers(0));
        assertArrayEquals(arr3,Ex2_1.primeDividers(4004));
        assertArrayEquals(arr4,Ex2_1.primeDividers(-4004));
        assertArrayEquals(arr5,Ex2_1.primeDividers(2));

    }


}