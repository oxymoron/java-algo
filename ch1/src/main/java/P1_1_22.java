public class P1_1_22 {

    public static int rankNoRec(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) / 2;
            int am = a[mid];
            if (key < am)
                hi = mid - 1;
            else if (key > am)
                lo = mid + 1;
            else
                return mid;
        }
        return -1;
    }

    public static int rankRec(int key, int[] a){
        return rec(key, a, 0, a.length - 1, 0);
    }

    private static int rec(int key, int[] a, int lo, int hi, int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) sb.append(' ');
        StdOut.printf("%s%d %d\n",sb.toString(), lo, hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        int am = a[mid];
        if (key < am)
            hi = mid - 1;
        else if (key > am)
            lo = mid + 1;
        else
            return mid;
        return rec(key, a, lo, hi, depth + 1);
    }

}
