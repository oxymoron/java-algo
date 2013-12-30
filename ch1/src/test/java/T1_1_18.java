import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_18 {

    @Test
    public void test1() throws Exception {
        assertEquals(2*25, P1_1_18.mystery(2, 25));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(3*11, P1_1_18.mystery(3, 11));
    }

    @Test
    public void test3() throws Exception {
        assertEquals((int)Math.pow(2, 25), P1_1_18.mysteryMul(2, 25));
    }

    @Test
    public void test4() throws Exception {
        assertEquals((int)Math.pow(3, 11), P1_1_18.mysteryMul(3, 11));
    }
}
