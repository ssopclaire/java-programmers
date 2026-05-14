package lv1;

public class SumOfDivisors {
    public int solution(int n) {
        int sum = 0;

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                sum += i;

                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfDivisors sol = new SumOfDivisors();

        System.out.println(sol.solution(12));
        System.out.println(sol.solution(5));
    }
}