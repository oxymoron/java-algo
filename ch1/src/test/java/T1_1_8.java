import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_8 extends StdTest{

    @Test
    public void test1() throws Exception {
        System.out.println('b');
        assertEquals("b\n", out.toString());
    }

    @Test
    public void test2() throws Exception {
        System.out.println('b' + 'c');
        assertEquals("197\n", out.toString());
    }

    @Test
    public void test3() throws Exception {
        System.out.println((char)('a' + 4));
        assertEquals("e\n", out.toString());
    }
}
