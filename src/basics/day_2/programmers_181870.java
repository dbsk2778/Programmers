package basics.day_2;

import java.util.Arrays;

public class programmers_181870 {

  // stream 사용하기
  public static void main(String[] args) {
    String[] strArr = { "ab", "ac", "ad", "ae" };
    System.out.println(Arrays.toString(solution(strArr)));
  }

  public static String[] solution(String[] strArr) {
    return Arrays.stream(strArr).filter(s -> !s.contains("ad")).toArray(String[]::new);
  }
}
