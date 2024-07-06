package basics.day_8;

import java.util.Arrays;

public class programmers_181916 {

    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/181916
        주사위 게임 3
     */

    public static void main(String[] args) {
        System.out.println(solution(1, 1, 1, 1));
        System.out.println(solution(1, 2, 3, 4));
        System.out.println(solution(1, 1, 2, 2));
        System.out.println(solution(1, 2, 2, 2));
        System.out.println(solution(1, 2, 3, 4));
        System.out.println(solution(1, 2, 3, 3));
        System.out.println(solution(1, 2, 2, 3));
        System.out.println(solution(1, 2, 3, 4));
        System.out.println(solution(1, 2, 3, 5));
        System.out.println(solution(1, 2, 3, 6));
    }

    public static int solution(int a, int b, int c, int d) {

        int[] dice = { a, b, c, d };
        Arrays.sort(dice);

        int ans;

        if (dice[0] == dice[3]) { // 주사위 숫자 전부 동일
            ans = 1111 * dice[3];
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) {  // 주사위 숫자 세개가 같은 케이스
            ans = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) {  // 두개씩 동일
            ans = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } else if (dice[0] == dice[1]) { // 두개만 동일
            ans = dice[2] * dice[3];
        } else if (dice[1] == dice[2]) { // 두개만 동일
            ans = dice[0] * dice[3];
        } else if (dice[2] == dice[3]) { // 두개만 동일
            ans = dice[0] * dice[1];
        } else {
            ans = dice[0];
        }

        return ans;
    }
}
