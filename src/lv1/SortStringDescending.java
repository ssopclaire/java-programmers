package lv1;

import java.util.Arrays;

public class SortStringDescending {
    public String solution(String s) {
        char[] chars = s.toCharArray();

        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(new String(chars));

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        SortStringDescending sol = new SortStringDescending();

        System.out.println(sol.solution("Zbcdefg"));
    }
}