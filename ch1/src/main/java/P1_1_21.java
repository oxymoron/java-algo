public class P1_1_21 {

    public static void convert() {
        while (StdIn.hasNextLine()){
            String s = StdIn.readString();
            int a = StdIn.readInt();
            int b = StdIn.readInt();
            double c = (double) a / (double) b;
            StdOut.printf("%s %d %d %.3f", s, a, b, c);
            StdOut.println();
        }

    }
}
