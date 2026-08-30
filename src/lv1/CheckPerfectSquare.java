package lv1;

public class CheckPerfectSquare {
    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);

        if (sqrt * sqrt == n) {
            return (sqrt + 1) * (sqrt + 1);
        }

        return -1;
    }

    public static void main(String[] args) {
        CheckPerfectSquare sol = new CheckPerfectSquare();

        System.out.println(sol.solution(121));
        System.out.println(sol.solution(3));
    }
}