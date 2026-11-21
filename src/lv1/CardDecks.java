package lv1;

public class CardDecks {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        return answer;
    }

    public static void main(String[] args) {
        CardDecks solver = new CardDecks();

        System.out.println(solver.solution(
                new String[]{"i", "drink", "water"},
                new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"}
        ));

        System.out.println(solver.solution(
                new String[]{"i", "water", "drink"},
                new String[]{"want", "to"},
                new String[]{"i", "want", "to", "drink", "water"}
        ));
    }
}