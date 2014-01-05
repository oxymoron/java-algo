import java.util.Arrays;

public class P1_1_27 {

    public static int count;

    public static double binomialNaive(int n, int k, double p){
        count++;
        if (n == 0 && k == 0) return 1.0;
        if (n < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomialNaive(n - 1, k, p) + p * binomialNaive(n - 1, k - 1, p);
    }

    public static double binomialDynamicProgramming(int n, int k, double p) {
        double[][] dp = new double[n + 1][k + 1];
        for (double[] item : dp) {
            Arrays.fill(item, Double.MAX_VALUE);
        }
        return rec(n, k, p, dp);
    }

    private static double rec(int n, int k, double p, double[][] dp) {
        count++;
        if (n == 0 && k == 0) return 1.0;
        if (n < 0 || k < 0) return 0.0;
        if (dp[n][k] != Double.MAX_VALUE) return dp[n][k];
        double result = (1.0 - p) * rec(n - 1, k, p, dp) + p * rec(n - 1, k - 1, p, dp);
        dp[n][k] = result;
        return result;
    }
}
