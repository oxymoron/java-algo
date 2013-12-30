public class P1_1_18 {

    public static int mystery(int a, int b){
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int mysteryMul(int a, int b){
        if (b == 0) return 1;
        if (b % 2 == 0) return mysteryMul(a * a, b / 2);
        return mysteryMul(a * a, b / 2) * a;
    }
}
