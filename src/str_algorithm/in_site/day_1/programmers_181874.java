package str_algorithm.in_site.day_1;

public class programmers_181874 {

  // A는 대문자로, A가 아닌 대문자는 모두 소문자로 변환

  public static void main(String[] args) {
    System.out.println(solution("abstract algebra"));
    System.out.println(solution2("PrOgRaMmErS"));
  }

  public static String solution(String s) {
    StringBuilder sb = new StringBuilder();
    for (char c : s.toCharArray()) {
      if (c == 'a') {
        sb.append('A');
      } else {
        sb.append(Character.toLowerCase(c));
      }
    }
    return sb.toString();
  }

  public static String solution2(String s) {
    return s.toLowerCase().replaceAll("a", "A");
  }
}
