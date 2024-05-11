package basics.day_4;

public class programmers_181908 {

  /*
    181908 - 접미사인지 확인하기
   */

  public static void main(String[] args) {
    System.out.println(solution("abc1abc1abc", "abc"));
    System.out.println(solution("abc1abc1abc", "bc"));
  }

  public static int solution(String my_string, String is_suffix) {
    return my_string.endsWith(is_suffix) ? 1 : 0;
  }
}
