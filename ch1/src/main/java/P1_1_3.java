public class P1_1_3 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        StdOut.print((a == b && b == c) ? "equal" : "not equal");
    }
}
