public class P1_1_14 {

    public static int lg(int n) {
        int cnt = 0;
        while(n > 1){
            n /= 2;
            cnt++;
        }
        return cnt;
    }
}
