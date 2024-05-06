package basics.day_4;

import java.util.ArrayList;
import java.util.List;

public class programmers_181918 {

  public static void main(String[] args) {
    // 181918 - 배열 만들기 4
    System.out.println(solution(new int[] {3, 5, 2, 7, 6}));
    System.out.println(solution(new int[] {3, 5, 2, 7, 6, 1, 4, 8, 9}));
  }
  public static List<Integer> solution(int[] arr) {
    List<Integer> stk = new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
      if (stk.isEmpty()) {
        stk.add(arr[i]);
      } else if (stk.get(stk.size() - 1) < arr[i]) {
        stk.add(arr[i]);
      } else if (stk.get(stk.size() - 1) >= arr[i]) {
        stk.remove(stk.size() - 1);
        // stk 리스트에서 요소를 제거한 이후 같은 요소를 다시 확인하기 위해 !!
        i--;
      }
    }
    return stk;
  }
}
