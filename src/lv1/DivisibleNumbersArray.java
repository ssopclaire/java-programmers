package lv1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class DivisibleNumbersArray {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            return new int[]{-1};
        }

        Collections.sort(list);

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        DivisibleNumbersArray sol = new DivisibleNumbersArray();

        System.out.println(Arrays.toString(sol.solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(sol.solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(sol.solution(new int[]{3, 2, 6}, 10)));
    }
}