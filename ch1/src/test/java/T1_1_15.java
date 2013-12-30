import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class T1_1_15 {

    @Test
    public void test1() throws Exception {
        int[] a = new int[]{1,5,3,2,1,2};
        assertArrayEquals(new int[]{0,2,2,1,0,1}, P1_1_15.histogram(a, 6));
    }

    @Test
    public void test2() throws Exception {
        int[] a = new int[]{1,5,3,2,1,2};
        assertArrayEquals(new int[]{0,2,2}, P1_1_15.histogram(a, 3));
    }
}
