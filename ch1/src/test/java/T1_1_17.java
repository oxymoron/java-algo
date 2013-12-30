import org.junit.Test;

public class T1_1_17 {

    @Test(expected = StackOverflowError.class)
    public void test1() throws Exception {
        P1_1_17.exR2(6);
    }
}
