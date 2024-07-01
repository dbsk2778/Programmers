package basics.day_5;

import java.util.Arrays;

public class programmers_181909 {

  /*
      p. 120 / programmers_181909
      문제: 접미사 배열
   */
  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution("banana")));
    System.out.println(Arrays.toString(solution("programmers")));
  }

  public static String[] solution(String my_string) {
    int len = my_string.length();
    String[] answer = new String[len];

    for (int i = 0; i < len; i++) {
      // substring(int beginIndex, int endIndex)
//      answer[i] = my_string.substring(i, len);
      // 이 값에서는 가장 마지막 값까지 전부 다 가져오는거기 때문에 endIndex 없어도 됨
      answer[i] = my_string.substring(i);
    }
    Arrays.sort(answer);
    return answer;
  }
}
