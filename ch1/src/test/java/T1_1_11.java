import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class T1_1_11 extends StdTest{

    @Test
    public void test1() throws Exception {
        boolean[][] arr = new boolean[2][5];
        arr[0] = new boolean[]{true, false, true, true, false};
        arr[1] = new boolean[]{false, true, false, true, true};
        P1_1_11.show(arr);
        assertEquals("* ** \n * **\n", out.toString());
    }
}
