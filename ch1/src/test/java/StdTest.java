/*
 * Developer: Andrey Zubkov
 * Date: 2013-12-28
 */

import org.junit.After;
import org.junit.Before;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.lang.reflect.Field;

public class StdTest {

    private PrintWriter originalWriter;
    private PrintStream originalOut;
    private PrintStream modifiedOut;
    protected ByteArrayOutputStream out = new ByteArrayOutputStream();
    private Field field;

    @Before
    public void setUp() throws Exception {
        originalOut = System.out;
        modifiedOut = new PrintStream(out);
        System.setOut(modifiedOut);

        field = StdOut.class.getDeclaredField("out");
        field.setAccessible(true);
        originalWriter = (PrintWriter) field.get(field);
        field.set(field, new PrintWriter(new OutputStreamWriter(modifiedOut, "UTF-8"), true));
    }

    @After
    public void tearDown() throws Exception {
        field.set(field, originalWriter);
        System.setOut(originalOut);
    }
}
