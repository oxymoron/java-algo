import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class T1_1_13 {
    @Test
    public void test1() throws Exception {
        int m = 3;
        int n = 2;
        int[][] a = new int[m][n];
        a[0] = new int[]{1,2};
        a[1] = new int[]{3,4};
        a[2] = new int[]{5,6};
        int[][] b = P1_1_13.transpose(a, m, n);
        assertEquals(2, b.length);
        assertArrayEquals(new int[]{1,3,5}, b[0]);
        assertArrayEquals(new int[]{2,4,6}, b[1]);
    }
}
