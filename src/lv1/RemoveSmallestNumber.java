package lv1;

import java.util.Arrays;

public class RemoveSmallestNumber {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        int[] answer = new int[arr.length - 1];

        int index = 0;

        for (int num : arr) {
            if (num != min) {
                answer[index++] = num;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        RemoveSmallestNumber sol = new RemoveSmallestNumber();

        System.out.println(Arrays.toString(sol.solution(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(sol.solution(new int[]{10})));
    }
}