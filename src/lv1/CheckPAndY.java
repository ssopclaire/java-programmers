package lv1;

public class CheckPAndY {
    public boolean solution(String s) {
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c == 'p' || c == 'P') {
                count++;
            } else if (c == 'y' || c == 'Y') {
                count--;
            }
        }

        return count == 0;
    }

    public static void main(String[] args) {
        CheckPAndY sol = new CheckPAndY();

        System.out.println(sol.solution("Python"));
        System.out.println(sol.solution("Programming"));
    }
}