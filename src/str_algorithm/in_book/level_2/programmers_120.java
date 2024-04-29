package str_algorithm.in_book.level_2;

import java.util.*;

public class programmers_120 {

  /*
      p. 120 / programmers_60057
      문제: 문자열 s를 압축하여 가장 짧은 길이를 리턴
   */
  public static void main(String[] args) {
    System.out.println(solution("aabbaccc"));
    System.out.println(solution("ababcdcdababcdcd"));
    System.out.println(solution("abcabcdede"));
  }

  private static List<String> getSplitList(String s, int length) {
    List<String> arr = new ArrayList<>();
    for (int start = 0; start < s.length(); start += length) {
      int end = Math.min(start + length, s.length());
      arr.add(s.substring(start, end));
    }
    return arr;
  }

  // 만약 char로 봤을때 그 다음 문자가 같다면 count를 증가시키고, 다르다면 count를 문자열로 변환하여 앞에 붙여준다.
  public static int solution(String s) {
    int min = Integer.MAX_VALUE;

    for (int i = 1; i <= s.length(); i++) {
      int compressed = compress(s, i);
      min = Math.min(min, compressed);
    }
    return min;
  }

  // 문자열을 압축하는 함수
  public static int compress(String s, int length) {
    StringBuilder sb = new StringBuilder();
    String last = "";  // 직전의 문자열을 담는 변수
    int count = 0;  // 문자열이 반복되는 횟수를 담는 변수
    for (String token : getSplitList(s, length)) {
      // 이전 문자열과 동일하다면 반복 횟수만 증가
      if (token.equals(last)) {
        count++;
      } else {  // 새로운 토큰이 등장했다면 (이전 문자열과 다르다면) 직전까지의 압축 문자열을 만들어준다.
        if (count > 1) {
          sb.append(count);
        }
        sb.append(last);
        last = token;
        count = 1;  // count를 1로 초기화 (새로운 문자열이 등장했으므로)
      }
    }

    // 마지막 문자열에 대한 처리 (반복 횟수가 1보다 크다면 반복 횟수를 문자열에 추가)
    if (count > 1) {
      sb.append(count);
    }
    sb.append(last);
    return sb.length();
  }
}
