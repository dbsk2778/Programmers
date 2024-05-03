package str_algorithm.in_site.day_1;

public class programmers_181950 {

  // 문자열 반복해서 출력하기
  public static void main(String[] args) {
    solution("abc", 3);
    solution2("abc", 3);
  }

  public static void solution(String s, int n) {
    System.out.println(s.repeat(Math.max(0, n)));
  }

  public static void solution2(String s, int n) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < n; i++) {
      sb.append(s);
    }

    System.out.println(sb);
  }
}
