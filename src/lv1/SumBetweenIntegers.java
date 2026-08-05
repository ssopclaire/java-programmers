package lv1;

public class SumBetweenIntegers {
    public long solution(int a, int b) {
        long answer = 0;

        int start = Math.min(a, b);
        int end = Math.max(a, b);

        for (int i = start; i <= end; i++) {
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        SumBetweenIntegers sol = new SumBetweenIntegers();

        System.out.println(sol.solution(3, 5));
        System.out.println(sol.solution(3, 3));
        System.out.println(sol.solution(5, 3));
    }
}