package lv1;

public class EvenOrOdd {
    public String solution(int num) {
        if (num % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }

    public static void main(String[] args) {
        EvenOrOdd sol = new EvenOrOdd();

        System.out.println(sol.solution(3));
        System.out.println(sol.solution(4));
    }
}