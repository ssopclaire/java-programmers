package lv1;

import java.util.Arrays;

public class NumbersWithInterval {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for (int i = 0; i < n; i++) {
            answer[i] = (long) x * (i + 1);
        }

        return answer;
    }

    public static void main(String[] args) {
        NumbersWithInterval sol = new NumbersWithInterval();

        System.out.println(Arrays.toString(sol.solution(2, 5)));
        System.out.println(Arrays.toString(sol.solution(4, 3)));
        System.out.println(Arrays.toString(sol.solution(-4, 2)));
    }
}