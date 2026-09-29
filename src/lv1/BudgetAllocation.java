package lv1;

import java.util.Arrays;

public class BudgetAllocation {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int sum = 0;
        int answer = 0;

        for (int amount : d) {
            if (sum + amount > budget) {
                break;
            }

            sum += amount;
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        BudgetAllocation sol = new BudgetAllocation();

        System.out.println(sol.solution(new int[]{1, 3, 2, 5, 4}, 9));
        System.out.println(sol.solution(new int[]{2, 2, 3, 3}, 10));
    }
}