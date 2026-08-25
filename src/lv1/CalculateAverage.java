package lv1;

public class CalculateAverage {
    public double solution(int[] arr) {
        double sum = 0;

        for (int num : arr) {
            sum += num;
        }

        return sum / arr.length;
    }

    public static void main(String[] args) {
        CalculateAverage sol = new CalculateAverage();

        System.out.println(sol.solution(new int[]{1, 2, 3, 4}));
        System.out.println(sol.solution(new int[]{5, 5}));
    }
}