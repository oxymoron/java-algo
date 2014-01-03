import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_22 extends StdTest{

    @Test
    public void test1() throws Exception {
        int index = P1_1_22.rankRec(20, new int[]{10, 15, 20, 30, 40, 50, 60, 70, 80});
        assertEquals(2, index);
        assertEquals("0 8\n 0 3\n  2 3\n", out.toString());
    }


}
