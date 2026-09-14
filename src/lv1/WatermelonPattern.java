package lv1;

public class WatermelonPattern {
    public String solution(int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append("수");
            } else {
                sb.append("박");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        WatermelonPattern sol = new WatermelonPattern();

        System.out.println(sol.solution(3));
        System.out.println(sol.solution(4));
    }
}