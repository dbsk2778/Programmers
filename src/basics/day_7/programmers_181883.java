package basics.day_7;

import java.util.Arrays;

public class programmers_181883 {

  /*
      문제 설명: 프로그래머스 181883 + 수열과 구간 쿼리 1
   */

    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 1}, {1, 2}, {2, 3}};
        System.out.println(Arrays.toString(solution(arr, queries)));

    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                arr[i] += 1;
            }
        }
        return arr;
    }
}
