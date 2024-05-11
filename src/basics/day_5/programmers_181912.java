package basics.day_5;

import java.util.ArrayList;
import java.util.List;

public class programmers_181912 {

  public static void main(String[] args) {
    String[] intStrs = { "0123456789","9876543210","9999999999999" };
    int k = 50000;
    int s = 5;
    int l = 5;

    int[] result = solution(intStrs, k, s, l);
    for (int i : result) {
      System.out.println(i);
    }
  }

  public static int[] solution(String[] intStrs, int k, int s, int l) {
    List<Integer> list = new ArrayList<>();

    for (String str : intStrs) {
      int i = Integer.parseInt(str.substring(s, s + l));
      if (i > k) {
        list.add(i);
      }
    }
    int[] newArr = {};

    if (!list.isEmpty()) {
      newArr = new int[list.size()];
      for (int i = 0; i < list.size(); i++) {
        newArr[i] = list.get(i);
      }
    }

    return newArr;
  }
}
