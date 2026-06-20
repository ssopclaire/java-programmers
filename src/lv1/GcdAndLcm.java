package lv1;

import java.util.Arrays;

public class GcdAndLcm {
    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = n * m / gcd;

        return new int[]{gcd, lcm};
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;

            b = a % b;
            a = temp;
        }

        return a;
    }

    public static void main(String[] args) {
        GcdAndLcm sol = new GcdAndLcm();

        System.out.println(Arrays.toString(sol.solution(3, 12)));
        System.out.println(Arrays.toString(sol.solution(18, 24)));
    }
}