import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_21 extends StdTest{

    @Test
    public void test1() throws Exception {
        setInput("abc 1 2\ndef 2 3");
        P1_1_21.convert();
        assertEquals("abc 1 2 0.500\ndef 2 3 0.667\n", out.toString());
    }
}
