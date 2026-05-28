package lv1;

public class HarshadNumber {
    public boolean solution(int x) {
        int sum = 0;
        int num = x;

        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        return x % sum == 0;
    }

    public static void main(String[] args) {
        HarshadNumber sol = new HarshadNumber();

        System.out.println(sol.solution(18));
        System.out.println(sol.solution(13));
    }
}