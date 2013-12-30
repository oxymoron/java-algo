import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_6 extends StdTest{

    @Test
    public void testTask() throws Exception {
        P1_1_6.task();
        assertEquals("0\n1\n1\n2\n3\n5\n8\n13\n21\n34\n55\n89\n144\n233\n377\n610\n", out.toString());
    }
}
