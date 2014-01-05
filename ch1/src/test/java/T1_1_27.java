import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class T1_1_27 {

    @Before
    public void setUp() throws Exception {
        P1_1_27.count = 0;
    }

    @Test
        public void test1() throws Exception {
        double result = P1_1_27.binomialNaive(10, 5, 0.5);
        assertEquals(0.246, result, 0.001);
        assertEquals(2467, P1_1_27.count);
    }

    @Test
    public void test2() throws Exception {
        double result = P1_1_27.binomialDynamicProgramming(10, 5, 0.5);
        assertEquals(0.246, result, 0.001);
        assertEquals(101, P1_1_27.count);
    }

    @Test
    public void test4() throws Exception {
        double result = P1_1_27.binomialDynamicProgramming(100, 50, 0.5);
        assertEquals(0.0795, result, 0.0001);
        assertEquals(7751, P1_1_27.count);
    }
}
