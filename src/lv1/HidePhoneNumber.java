package lv1;

public class HidePhoneNumber {
    public String solution(String phoneNumber) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < phoneNumber.length() - 4; i++) {
            sb.append('*');
        }

        sb.append(phoneNumber.substring(phoneNumber.length() - 4));

        return sb.toString();
    }

    public static void main(String[] args) {
        HidePhoneNumber sol = new HidePhoneNumber();

        System.out.println(sol.solution("01033334444"));
        System.out.println(sol.solution("027778888"));
    }
}