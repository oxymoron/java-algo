public class P1_1_13 {

    public static int[][] transpose(final int[][] a, final int m, final int n) {
        int[][] b = new int[n][m];
        for(int i = 0; i < m; i++){
            for (int j = 0; j < n ; j++){
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
}
