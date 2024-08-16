package sort.in_book.level_1;

import java.util.Arrays;

public class programmers12915 {
    public static void main(String[] args) {
        String[] strings = new String[] { "sun", "bed", "car"};
        System.out.println(Arrays.toString(solution(strings, 1)));
    }

    public static String[] solution(String[] strings, int n) {
        // 주어진 문자열을 n번째 문자를 이용하여 정렬
        // 문자(문자열 아님!!)의 비교는 뺄셈 연산자로 가능하고, n번째 문자를 가져오는 건 charAt(n)으로 가능
        // 다른 조건 없다면 Arrays.sort(strings, (s1, s2) -> s1.charAt(n) - s2.charAt(n));
        // 문제에서 사전순 정렬 (두번째 조건 있음)
        Arrays.sort(strings, (s1, s2) -> {
            // 중괄호 사용하여 람다식 여러 줄로 작성 가능!!
            if (s1.charAt(n) != s2.charAt(n)) {
                return s1.charAt(n) - s2.charAt(n);
            } else {
                // compareTo() 메서드는 사전 순 정렬 가능하게 해줌
                return s1.compareTo(s2);
            }
        });

        return strings;
    }

    public static void example(String[] strings, int n) {
        // 단순한 n번째 글자로 정렬
        // 아래의 코드는 String을 int로 나타내서 비교함, 이와 같이 String을 int로 나타내서 정렬해야 하는 경우가 많은데,

        Arrays.sort(strings, (s1, s2) -> s1.charAt(n) - s2.charAt(n));
    }
}
