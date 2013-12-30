public class P1_1_15 {

    // linear-time implementation
    public static int[] histogram(final int[] a, final int m){
        int b[] = new int[m];
        for (int it : a)
            if (it >=0 && it < m) b[it]++;
        return b;
    }

    // Inefficient naive quadratic-time implementation
    public static int[] histogramNaive(final int[] a, final int m){
        int b[] = new int[m];
        for (int i = 0; i < m ; i++){
            b[i] = 0;
            for (int it : a) {
                if (it == i) b[i]++;
            }
        }
        return b;
    }
}
