package basics.day_3;

import java.util.Arrays;

public class programmers_181923 {

  public static void main(String[] args) {
    // 181923 - 배열에서 특정 범위 내의 값 중에서 특정 값보다 크면서 가장 작은 값 찾기
    int[] arr = {0, 1, 2, 4, 3};
    int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
    System.out.println(Arrays.toString(solution(arr, queries)));
  }

  public static int[] solution(int[] arr, int[][] queries) {
    int[] answer = new int[queries.length];

    for (int i = 0; i < queries.length; i++) {
      // int 형식 값 중 가장 큰 값 == Integer.MAX_VALUE
      int min = Integer.MAX_VALUE;
      for (int j = queries[i][0]; j <= queries[i][1]; j++) {
        // arr[j] > queries[i][2] : 특정 값보다 큰 값, 가장 작은 값 찾기 위해 min 변수 사용
        if (arr[j] > queries[i][2] && arr[j] < min) {
          min = arr[j];
        }
      }
      answer[i] = (min == Integer.MAX_VALUE) ? -1 : min;
    }

    return answer;
  }
}
