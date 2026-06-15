package lv1;

public class MakeWeirdString {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();

        int index = 0;

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(c);

                index = 0;
            } else {
                if (index % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }

                index++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        MakeWeirdString sol = new MakeWeirdString();

        System.out.println(sol.solution("Practice Java algorithms."));
        System.out.println(sol.solution("Only happy birds sing."));
    }
}