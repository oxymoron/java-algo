import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_24 extends StdTest{

    @Test
    public void test1() throws Exception {
        int result = P1_1_24.gcd(105, 24);
        assertEquals(3, result);
        assertEquals(
                "105 24\n" +
                "24 9\n" +
                "9 6\n" +
                "6 3\n" +
                "3 0\n", out.toString());
    }

    @Test
    public void test2() throws Exception {
        int result = P1_1_24.gcd(1111111, 1234567);
        assertEquals(1, result);
    }
}
