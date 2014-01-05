import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class T1_1_28 {

    @Test
    public void test1() throws Exception {
        int[] a = new int[]{1, 3, 4, 1, 10};
        int[] b = new int[]{2, 1, 10, 5};
        int[] c = P1_1_28.whitelist(a, b);
        assertArrayEquals(new int[]{2, 5}, c);
    }
}
