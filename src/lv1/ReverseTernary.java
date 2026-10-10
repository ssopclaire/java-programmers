package lv1;

public class ReverseTernary {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 3);

            n /= 3;
        }

        return Integer.parseInt(sb.toString(), 3);
    }

    public static void main(String[] args) {
        ReverseTernary sol = new ReverseTernary();

        System.out.println(sol.solution(45));
        System.out.println(sol.solution(125));
    }
}