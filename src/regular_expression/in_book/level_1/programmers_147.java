package regular_expression.in_book.level_1;

public class programmers_147 {
  /*
      p. 147 / programmers_12918
      문제: 문자열 s가 숫자로만 구성되어 있는지 확인
   */

  public static void main(String[] args) {
    System.out.println(solution("1234"));
    System.out.println(solution("a234"));

    System.out.println(solution2("1234"));
    System.out.println(solution2("a234"));
  }

  /*
    - 정규표현식을 사용하여 문자열이 숫자로만 구성되어 있는지 확인
    - ^: 시작, $: 끝, [0-9]: 0부터 9까지의 숫자, *: 앞의 패턴이 0번 이상 반복됨
   */
  public static boolean solution(String s) {
    // return s.matches("[0-9]{4}|[0-9]{6}");
    if (s.length() == 4 || s.length() == 6) {
      // 모든 문자가 소문자인지 확인하는 정규식은 [a-z]*, 대문자는 [A-Z]*, 숫자는 [0-9]*로 표현
      return s.matches("^[0-9]*");
    }
    return false;
  }

  // Exception을 이용한 방법은 지양 - 이런 방법도 있지만, 예외는 실제 얘외 상황에서만 사용해야 함 !!
  public static boolean solution2(String s) {
    if(s.length() == 4 || s.length() == 6){
      try{
        Integer.parseInt(s);
        return true;
      } catch(NumberFormatException e){
        return false;
      }
    }
    return false;
  }
}
