import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_12 extends StdTest{

    @Test
    public void test1() throws Exception {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);

        assertEquals("0\n1\n2\n3\n4\n5\n6\n7\n8\n9\n", out.toString());
    }
}
