package lv1;

public class CaesarCipher {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                c = (char) ((c - 'A' + n) % 26 + 'A');
            } else if (c >= 'a' && c <= 'z') {
                c = (char) ((c - 'a' + n) % 26 + 'a');
            }

            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        CaesarCipher sol = new CaesarCipher();

        System.out.println(sol.solution("AB", 1));
        System.out.println(sol.solution("z", 1));
        System.out.println(sol.solution("a B z", 4));
    }
}