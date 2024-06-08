package basics.day_5;

import java.util.ArrayList;
import java.util.List;

public class programmers_181904 {

  /*
    프로그래머스 181904 세로 읽기

   */

  public static void main(String[] args) {
    System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
    System.out.println(solution("programmers", 1, 1));

  }

  public static String solution(String my_string, int m, int c) {
    StringBuilder answer = new StringBuilder();
    List<String> strs = new ArrayList<>();

    for (int i = 0; i < my_string.length(); i += m) {
      int end = i + m;
      int lastIndex = Math.min(end, my_string.length());
      // int lastIndex = end < my_string.length() ? end : my_string.length();
      strs.add(my_string.substring(i, lastIndex));
    }
    for (String str : strs) {
      answer.append(str.charAt(c - 1));
    }
    return answer.toString();
  }


  public static String solution2(String my_string, int m, int c) {
    StringBuilder answer = new StringBuilder();

    for (int i = c - 1; i < my_string.length(); i += m) {
      answer.append(my_string.charAt(i));
    }
    return answer.toString();
  }
}
