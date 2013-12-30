import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class T1_1_19 {

    @Test
    public void test1() throws Exception {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                P1_1_19.F(30);
            }
        });
        thread.start();
        thread.join(1000);
        assertFalse(thread.isAlive());
    }

    @Test
    public void test2() throws Exception {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                P1_1_19.F(80);
            }
        });
        thread.start();
        thread.join(1000);
        assertTrue(thread.isAlive());
    }

    @Test
    public void test3() throws Exception {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                P1_1_19.FDP(80);
            }
        });
        thread.start();
        thread.join(1000);
        assertFalse(thread.isAlive());
    }

}
