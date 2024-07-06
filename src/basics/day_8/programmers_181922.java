package basics.day_8;

import java.util.Arrays;

public class programmers_181922 {

    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/181922
        수열과 구간 쿼리 4
     */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[][] queries = {{1, 3, 2}, {2, 4, 1}, {3, 4, 1}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }

    public static int[] solution(int[] arr, int[][] queries) {
        for (int[] query: queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];

            for (int i = s; i <= e; i++) {
                if (i % k == 0) {
                    arr[i] += 1;
                }
            }
        }
        return arr;
    }
}
