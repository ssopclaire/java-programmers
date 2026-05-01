package lv1;

public class FindRemainderOne {
    public int solution(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 1) return i;
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(new FindRemainderOne().solution(10));
    }
}