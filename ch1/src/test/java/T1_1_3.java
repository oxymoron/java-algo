import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_3 extends StdTest{

    @Test
    public void testEqual() throws Exception {
        P1_1_3.main(new String[]{"4", "4", "4"});
        assertEquals("equal", out.toString());
    }

    @Test
    public void testNotEqual() throws Exception {
        P1_1_3.main(new String[]{"1", "2", "3"});
        assertEquals("not equal", out.toString());
    }
}
