public class P1_1_24 {

    public static int gcd(int p, int q) {
        return rec(p, q, 0);
    }

    private static int rec(int p, int q, int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0 ; i < depth; i++) sb.append(' ');
        StdOut.printf("%s%d %d\n", sb.toString(), p, q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
