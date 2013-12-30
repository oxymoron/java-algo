import org.junit.Test;

import static org.junit.Assert.*;

public class T1_1_5{

    @Test
    public void testTask1() throws Exception {
        assertTrue(P1_1_5.check(0.1, 0.3));
    }

    @Test
    public void testTask2() throws Exception {
        assertFalse(P1_1_5.check(0.0, 0.3));
    }

    @Test
    public void testTask3() throws Exception {
        assertFalse(P1_1_5.check(0.3, 1.0));
    }

    @Test
    public void testTask4() throws Exception {
        assertFalse(P1_1_5.check(0.1, 2.3));
    }

    @Test
    public void testTask5() throws Exception {
        assertFalse(P1_1_5.check(-0.1, 2.3));
    }
}
