package lv1;

public class MinimumRectangle {
    public int solution(int[][] sizes) {
        int answer = 0;

        return answer;
    }

    public static void main(String[] args) {
        MinimumRectangle sol = new MinimumRectangle();

        int[][] sizes1 = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int[][] sizes2 = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}};
        int[][] sizes3 = {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}};

        System.out.println(sol.solution(sizes1));
        System.out.println(sol.solution(sizes2));
        System.out.println(sol.solution(sizes3));
    }
}