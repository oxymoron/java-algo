/*
 * Developer: Andrey Zubkov
 * Date: 2013-12-28
 */

import org.junit.After;
import org.junit.Before;

import java.io.*;
import java.lang.reflect.Field;
import java.util.Scanner;

public class StdTest {

    private PrintWriter originalWriter;
    private Scanner originalScanner;
    private PrintStream originalOut;
    private InputStream originalIn;
    private PrintStream modifiedOut;
    protected ByteArrayOutputStream out = new ByteArrayOutputStream();
    protected InputStream in;
    private Field outField;
    private Field scannerField;
    private boolean handleInput;

    protected void setInput(String str){
        try{
            handleInput = true;
            originalIn = System.in;
            byte[] bytes = str.getBytes("UTF-8");
            in = new ByteArrayInputStream(bytes);
            System.setIn(in);

            scannerField = StdIn.class.getDeclaredField("scanner");
            scannerField.setAccessible(true);
            originalScanner = (Scanner) scannerField.get(scannerField);
            scannerField.set(scannerField, new Scanner(new BufferedInputStream(in), "UTF-8"));

        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }

    @Before
    public void setUp() throws Exception {
        originalOut = System.out;
        modifiedOut = new PrintStream(out);
        System.setOut(modifiedOut);

        outField = StdOut.class.getDeclaredField("out");
        outField.setAccessible(true);
        originalWriter = (PrintWriter) outField.get(outField);
        outField.set(outField, new PrintWriter(new OutputStreamWriter(modifiedOut, "UTF-8"), true));
    }

    @After
    public void tearDown() throws Exception {
        if (this.handleInput){
            this.handleInput = false;
            scannerField.set(scannerField, originalScanner);
            System.setIn(originalIn);
        }
        outField.set(outField, originalWriter);
        System.setOut(originalOut);

    }
}
