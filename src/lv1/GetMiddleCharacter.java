package lv1;

public class GetMiddleCharacter {
    public String solution(String s) {
        int mid = s.length() / 2;

        if (s.length() % 2 == 0) {
            return s.substring(mid - 1, mid + 1);
        }

        return s.substring(mid, mid + 1);
    }

    public static void main(String[] args) {
        GetMiddleCharacter sol = new GetMiddleCharacter();

        System.out.println(sol.solution("coding"));
        System.out.println(sol.solution("java"));
    }
}