package lv1;

import java.util.Arrays;

public class ReverseDigitsArray {
    public int[] solution(long n) {
        String str = String.valueOf(n);

        int[] answer = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            answer[i] = str.charAt(str.length() - 1 - i) - '0';
        }

        return answer;
    }

    public static void main(String[] args) {
        ReverseDigitsArray sol = new ReverseDigitsArray();

        System.out.println(Arrays.toString(sol.solution(12345)));
        System.out.println(Arrays.toString(sol.solution(987654)));
    }
}