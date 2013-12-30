import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_14 {

    @Test
    public void test1() throws Exception {
        assertEquals(5, P1_1_14.lg(35));
    }

    @Test
    public void test2() throws Exception {
        assertEquals(10, P1_1_14.lg(1024));
    }
}
