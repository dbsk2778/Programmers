package basics.day_2;

public class programmers_181934 {

  public static void main(String[] args) {
    // 조건 문자열 (181934)
    System.out.println(solution(">", "=", 1, 1));
    System.out.println(solution2(">", "=", 1, 1));

    // 부분 문자열 이어 붙여 문자열 만들기 (181911
    System.out.println(solution3(new String[] { "abcde", "12345" }, new int[][] { { 1, 3 }, { 0, 2 } }));
  }

  public static int solution(String ineq, String eq, int n, int m) {
    boolean isTrue;
    String s = ineq + eq;

    if (s.equals(">=")) {
      isTrue = (n >= m);
    } else if (s.equals("<=")) {
      isTrue = (n <= m);
    } else if (s.equals(">!")) {
      isTrue = (n > m);
    } else {
      isTrue = (n < m);
    }
    return isTrue ? 1 : 0;
  }

  public static int solution2(String ineq, String eq, int n, int m) {
    return switch (ineq + eq) {
      case ">=" -> n >= m ? 1 : 0;
      case "<=" -> n <= m ? 1 : 0;
      case ">!" -> n > m ? 1 : 0;
      default -> n < m ? 1 : 0;
    };
  }

  public static String solution3(String[] my_strings, int[][] parts) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < my_strings.length; i++) {
      // sb.append(my_strings[i].substring(parts[i][0], parts[i][1]+1));
      // append(CharSequence s, int start, int end)
      sb.append(my_strings[i], parts[i][0], parts[i][1] + 1);
    }
    return sb.toString();
  }
}
