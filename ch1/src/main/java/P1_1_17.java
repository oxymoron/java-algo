public class P1_1_17 {

    public static String exR2(int n){
        String s = exR2(n-3) + n + exR2(n-2) + n;
        if (n <= 0) return "";
        return s;
    }
}
