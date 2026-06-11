package lv1;

public class ValidateNumericString {
    public boolean solution(String s) {
        if (s.length() != 4 && s.length() != 6) {
            return false;
        }

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        ValidateNumericString sol = new ValidateNumericString();

        System.out.println(sol.solution("2026"));
        System.out.println(sol.solution("20A6"));
    }
}