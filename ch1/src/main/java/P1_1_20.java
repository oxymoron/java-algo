public class P1_1_20 {

    public static double LNF(int n){
        if (n == 1) return 0;
        return Math.log(n) + LNF(n-1);
    }
}
