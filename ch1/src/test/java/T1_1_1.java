import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_1 {

    @Test
    public void testTask() throws Exception {
        assertEquals(7, (0 + 15)/2);
        assertEquals(200.0000002, 2.0e-6 * 100000000.1, 0.000000001);
        assertEquals(true, true && false || true && true);
    }
}
