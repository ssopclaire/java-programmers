package lv1;

public class StringToInteger {
    public int solution(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        StringToInteger sol = new StringToInteger();

        System.out.println(sol.solution("1234"));
        System.out.println(sol.solution("-1234"));
    }
}