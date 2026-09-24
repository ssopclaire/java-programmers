package lv1;

public class CountSmallSubstrings {
    public int solution(String t, String p) {
        int answer = 0;
        long target = Long.parseLong(p);

        for (int i = 0; i <= t.length() - p.length(); i++) {
            long number = Long.parseLong(t.substring(i, i + p.length()));

            if (number <= target) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        CountSmallSubstrings sol = new CountSmallSubstrings();

        System.out.println(sol.solution("3141592", "271"));
        System.out.println(sol.solution("500220839878", "7"));
        System.out.println(sol.solution("10203", "15"));
    }
}