package str_algorithm.in_book.level_1;

public class programmers_110 {

  /*
     p. 110 / programmers_12926
     문제: 시저 암호, 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만들어라.
  */

  public static void main(String[] args) {
    System.out.println(solution("AB", 1));
    System.out.println(solution("z", 1));
    System.out.println(solution("a B z", 4));
  }

  // 알파벳을 n만큼 밀기 : 아스키 코드 값을 n만큼 증가시키는 것과 동일, 주의할 점은 마지막 아스키 코드 값을 가지는 'z'와 'Z'를 넘어가는 경우를 처리해야 함
  public static String solution(String s, int n) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      // c를 n만큼 민 문자를 sb에 추가
      sb.append(push(c, n));
    }
    return sb.toString();
  }

  // 민 문자를 반환
  private static char push(char c, int n) {
    /*
      !Character.isAlphabetic() 메서드를 사용하여 알파벳아닌지 확인(문제에 대/소문자/공백 아니면 없기 때문에 사용 가능)
      Character.isSpaceChar() 메서드를 사용하여 공백인지 확인
      대문자인지 확인: Character.isUpperCase() / 소문자인지 확인: Character.isLowerCase()
    */
    if (Character.isSpaceChar(c)) return c;
    int offset = Character.isUpperCase(c) ? 'A' : 'a';  // 대문자인지 확인하여 offset을 설정
    int position = c - offset;  // 현재 문자의 위치를 구함

    // position = (position + n) % 26;  // n만큼 민 위치를 구함
    position =
        (position + n) % ('Z' - 'A' + 1);  // n만큼 민 위치를 구함 ('Z' - 'A' + 1 값이 26이므로 26으로 대체 가능)

    return (char) (position + offset);  // 민 문자를 반환 (char 형으로 형변환)
  }
}
