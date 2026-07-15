package lv1;

import java.util.Arrays;

public class AddMatrices {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        AddMatrices sol = new AddMatrices();

        int[][] result1 = sol.solution(
                new int[][]{{1, 2}, {3, 4}},
                new int[][]{{5, 6}, {7, 8}}
        );

        int[][] result2 = sol.solution(
                new int[][]{{2, 4, 6}, {1, 3, 5}},
                new int[][]{{1, 1, 1}, {2, 2, 2}}
        );

        System.out.println(Arrays.deepToString(result1));
        System.out.println(Arrays.deepToString(result2));
    }
}