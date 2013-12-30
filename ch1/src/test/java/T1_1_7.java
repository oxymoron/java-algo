import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_7 extends StdTest{

    @Test
    public void test1() throws Exception {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t);
        assertEquals("3.00009\n", out.toString());
    }

    @Test
    public void test2() throws Exception {
        int sum = 0;
        for (int i = 1; i < 1000; i++) // 1..999
            for (int j = 0; j < i; j++) // 0..i-1
                sum++;
        // sum = 1 + 2 + ... + 999 = ((1 + 999)/2) * 999
        StdOut.println(sum);
        assertEquals("499500\n", out.toString());
    }

    @Test
    public void test3() throws Exception {
        int sum = 0;
        int N = 10;
        for (int i = 1; i < 1000; i *= 2) // i = 1,2,4,8,16,32,64,128,256,512 (10 total)
            for (int j = 0 ; j < N ; j++) // j = 0..N-1
                sum++;
        // sum = 10 * N;
        StdOut.println(sum);
        assertEquals("100\n", out.toString());
    }
}
