package basics.day_1;

public class programmers_181950 {

  // 문자열 반복해서 출력하기
  public static void main(String[] args) {
    solution("abc", 3);
    solution2("abc", 3);
  }

  public static void solution(String s, int n) {
    // Math.max 함수는 사용하지 않아도 됨 (n이 0 이상이기 때문에)
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
