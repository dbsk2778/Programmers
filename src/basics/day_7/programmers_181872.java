package basics.day_7;

public class programmers_181872 {

  /*
      문제 설명: 프로그래머스 181872 + 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
   */

  public static void main(String[] args) {
    System.out.println(solution("AbCdEFG", "dE"));
  }

  public static String solution(String myString, String pat) {
    int i = myString.lastIndexOf(pat);
    return myString.substring(0, i) + pat;
  }
}
