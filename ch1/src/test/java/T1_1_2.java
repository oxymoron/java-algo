import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_2 {

    @Test
    public void testTask() throws Exception {
        assertEquals(1.618, (1+2.236) /2, 0.0001);
        assertEquals(10.0, 1 + 2 + 3 + 4.0, 0.01);
        assertEquals(true, 4.1 >= 4);
        assertEquals("33", 1 + 2 + "3");
    }
}
