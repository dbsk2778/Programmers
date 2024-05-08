package str_algorithm.in_book.level_1;

public class programmers_137 {

  /*
      p. 137 / programmers_12916
      문제: 문자열 내 p와 y의 개수를 비교하여 같으면 true, 다르면 false를 리턴
   */
  public static void main(String[] args) {
    System.out.println(solution("pPoooyY"));
    System.out.println(solution("Pyy"));

    System.out.println(solution2("pPoooyY"));
    System.out.println(solution2("Pyy"));

    System.out.println(solution3("pPoooyY"));
    System.out.println(solution3("Pyy"));

    System.out.println(solution4("pPoooyY"));
    System.out.println(solution4("Pyy"));
  }

  public static boolean solution(String s) {
    s = s.toUpperCase();

    int pCount = 0;
    int yCount = 0;

    for (char c : s.toCharArray()) {
      if (c == 'P') {
        pCount++;
      } else if (c == 'Y') {
        yCount++;
      }
    }
    return pCount == yCount;
  }

  public static boolean solution2(String s) {
    // 문자열을 소문자로 변환한 후, p와 y의 개수를 비교
    // return s.chars().map(Character::toLowerCase).filter(c -> c == 'p').count() == s.chars().map(Character::toLowerCase).filter(c -> c == 'y').count();

    // 문자열을 소문자로 변환한 후, p와 y의 개수를 비교
    s = s.toLowerCase();
    return s.chars().filter(c -> c == 'p').count() == s.chars().filter(c -> c == 'y').count();
  }

  public static boolean solution3(String s) {
    s = s.toLowerCase();

    // 변수 하나 사용하기
    int count = 0;
    for (char c : s.toCharArray()) {
      if (c == 'p') {
        count++;
      } else if (c == 'y') {
        count--;
      }
    }
    return count == 0;
  }

  public static boolean solution4(String s) {
    s = s.toLowerCase();

    return s.replaceAll("p", "").length() == s.replaceAll("y", "").length();
  }
}
