import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_9 {

    @Test
    public void test1() throws Exception {
        assertEquals("1010", P1_1_9.toBin(10));
    }

    @Test
    public void test2() throws Exception {
        assertEquals("1100010101", P1_1_9.toBin(789));
    }
}
