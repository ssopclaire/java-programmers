package lv1;

public class CalculateInsufficientAmount {
    public long solution(int price, int money, int count) {
        long totalPrice = 0;

        for (int i = 1; i <= count; i++) {
            totalPrice += (long) price * i;
        }

        if (totalPrice <= money) {
            return 0;
        }

        return totalPrice - money;
    }

    public static void main(String[] args) {
        CalculateInsufficientAmount sol = new CalculateInsufficientAmount();

        System.out.println(sol.solution(3, 20, 4));
        System.out.println(sol.solution(2, 30, 3));
    }
}