package basics.day_3;

import java.util.Arrays;

public class programmers_181833 {

    public static void main(String[] args) {
        // 181833 - 대각선으로 1 채우기 (2차원 배열)
        System.out.println(Arrays.deepToString(solution(3)));

        // 181932 - 코드 처리하기
        System.out.println(solution("abc1abc1abc"));
        System.out.println(solution2("abc1abc1abc"));
    }

    // int 배열에서 값을 넣어주지 않은 부분은 자동으로 0으로 초기화되므로, 굳이 if / else 문을 사용하지 않아도 된다. -> String 배열은 null
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }

    // 181932 - 코드 처리하기
    public static String solution(String code) {
        StringBuilder sb = new StringBuilder();
        boolean mode = false; // mode = 0

        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
            } else if (!mode && i % 2 == 0) {
                sb.append(code.charAt(i));
            } else if (mode && i % 2 != 0) {
                sb.append(code.charAt(i));
            }
        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }

    public static String solution2(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char current = code.charAt(i);
            if (current == '1') {
                mode = mode == 0 ? 1 : 0;
                continue;
            }

            if (i % 2 == mode) {
                sb.append(current);
            }
        }
        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}
