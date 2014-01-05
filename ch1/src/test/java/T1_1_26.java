import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class T1_1_26 {

    @Test
    public void test1() throws Exception {
        int t;
        int a = 3;
        int b = 4;
        int c = 1;
        if (a > b) { t = a; a = b; b = t;}
        if (a > c) { t = a; a = c; c = t;}
        if (b > c) { t = b; b = c; c = t;}
        assertTrue(a <= b);
        assertTrue(b <= c);
    }
}
