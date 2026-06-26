package lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveConsecutiveDuplicates {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (list.isEmpty() || list.get(list.size() - 1) != num) {
                list.add(num);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        RemoveConsecutiveDuplicates sol = new RemoveConsecutiveDuplicates();

        System.out.println(Arrays.toString(sol.solution(new int[]{7, 7, 4, 5, 5, 0, 8})));
        System.out.println(Arrays.toString(sol.solution(new int[]{1, 1, 2, 3, 3})));
    }
}