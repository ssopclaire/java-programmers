package lv1;

public class SumOfDigits {
    public int solution(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfDigits sol = new SumOfDigits();

        System.out.println(sol.solution(1234));
        System.out.println(sol.solution(9876543));
    }
}