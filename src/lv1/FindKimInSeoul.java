package lv1;

public class FindKimInSeoul {
    public String solution(String[] seoul) {
        for (int i = 0; i < seoul.length; i++) {
            if ("Kim".equals(seoul[i])) {
                return "김서방은 " + i + "에 있다";
            }
        }

        return "";
    }

    public static void main(String[] args) {
        FindKimInSeoul sol = new FindKimInSeoul();

        System.out.println(sol.solution(new String[]{"Park", "Kim", "Lee"}));
        System.out.println(sol.solution(new String[]{"Jeong", "Lee", "Han", "Kim"}));
    }
}