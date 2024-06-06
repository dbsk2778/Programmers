package basics.day_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class programmers_181860 {

  /*
    프로그래머스 181860 - 빈 배열에 추가, 삭제하기
   */

  public static void main(String[] args) {
    int[] arr = {3, 2, 4, 1, 3};
    boolean[] flag = {true, false, true, false, false};
    System.out.println(Arrays.toString(solution(arr, flag)));
    System.out.println(Arrays.toString(solution2(arr, flag)));
  }

  public static int[] solution(int[] arr, boolean[] flag) {
    List<Integer> l = new ArrayList<>();
    for (int i = 0; i < flag.length; i++) {
      if (flag[i]) {
        for (int j = 0; j < arr[i] * 2; j++) {
          l.add(arr[i]);
        }
      } else {
        for (int j = 0; j < arr[i]; j++) {
          l.remove(l.size() - 1);
        }
      }
    }
    int[] answer = new int[l.size()];

    for (int i = 0; i < l.size(); i++) {
      answer[i] = l.get(i);
    }
    return answer;
  }

  public static int[] solution2(int[] arr, boolean[] flag) {
    String answer = "";

    for(int idx=0; idx<arr.length; idx++) {
      if(flag[idx]) {
        answer += String.valueOf(arr[idx]).repeat(arr[idx]*2);
      }
      else {
        answer = answer.substring(0, answer.length() - arr[idx]);
      }
    }

    return Stream.of(answer.split("")).mapToInt(Integer::parseInt).toArray();
  }

}
