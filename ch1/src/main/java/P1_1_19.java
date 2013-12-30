public class P1_1_19 {

    public static long F(int N){
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }


    public static long FDP(int N){
        long[] dp = new long[N+1];
        dp[1] = 1;
        for(int i = 2; i <= N; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[N];
    }

}
