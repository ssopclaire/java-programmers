package lv1;

public class CollatzConjecture {
    public int solution(int num) {
        long number = num;
        int count = 0;

        while (number != 1) {
            if (number % 2 == 0) {
                number /= 2;
            } else {
                number = number * 3 + 1;
            }

            count++;

            if (count == 500) {
                return -1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        CollatzConjecture sol = new CollatzConjecture();

        System.out.println(sol.solution(6));
        System.out.println(sol.solution(16));
    }
}