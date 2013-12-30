import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_20 extends StdTest{
    @Test
    public void test1() throws Exception {
        assertEquals(15.1044, P1_1_20.LNF(10), 0.0001);
    }
}
