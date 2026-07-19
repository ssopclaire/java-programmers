package lv1;

public class SumByDivisorCount {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            int count = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        SumByDivisorCount sol = new SumByDivisorCount();

        System.out.println(sol.solution(13, 17));
        System.out.println(sol.solution(24, 27));
    }
}