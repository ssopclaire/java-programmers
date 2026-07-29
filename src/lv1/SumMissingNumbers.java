package lv1;

public class SumMissingNumbers {
    public int solution(int[] numbers) {
        int answer = 45;

        for (int number : numbers) {
            answer -= number;
        }

        return answer;
    }

    public static void main(String[] args) {
        SumMissingNumbers sol = new SumMissingNumbers();

        System.out.println(sol.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
        System.out.println(sol.solution(new int[]{5, 8, 4, 0, 6, 7, 9}));
    }
}