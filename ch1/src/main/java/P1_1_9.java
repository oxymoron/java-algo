public class P1_1_9 {

    public static String toBin(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0){
            sb.insert(0, n % 2);
            n /= 2;
        }
        return sb.toString();
    }
}
