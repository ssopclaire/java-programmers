package lv1;

import java.util.Arrays;

public class SortDigitsDescending {
    public long solution(long n) {
        char[] arr = String.valueOf(n).toCharArray();

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));

        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        SortDigitsDescending sol = new SortDigitsDescending();

        System.out.println(sol.solution(118372));
        System.out.println(sol.solution(930211));
    }
}