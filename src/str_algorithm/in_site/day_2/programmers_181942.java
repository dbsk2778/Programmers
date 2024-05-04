package str_algorithm.in_site.day_2;

public class programmers_181942 {

  // 문자열 섞기
  public static void main(String[] args) {
    System.out.println(solution("abcde", "12345"));
    System.out.println(solution2("abcde", "12345"));
    System.out.println(solution3("abcde", "12345"));

    // String[] 배열 이어 붙이기
    System.out.println(joinStringArray(new String[] { "a", "b", "c", "d", "e" }));
  }

  public static String solution(String str1, String str2) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str2.length(); i++) {
      sb.append(str1.charAt(i));
      sb.append(str2.charAt(i));
    }
    return sb.toString();
  }

  // java에서는 문자열을 더할 때 + 연산자를 사용하면 성능이 좋지 않다.
  // char형을 string에 더할 때는 + 연산자를 사용해도 된다.
  public static String solution2(String str1, String str2) {
    String answer = "";

    for (int i = 0; i < str1.length(); i++) {
      answer += str1.charAt(i);
      answer += str2.charAt(i);
    }
    return answer;
  }

  public static String solution3(String str1, String str2) {
    StringBuilder sb = new StringBuilder();
    char[] char1 = str1.toCharArray();
    char[] char2 = str2.toCharArray();

    for (int i = 0; i < char1.length; i++) {
      sb.append(char1[i]).append(char2[i]);
    }
    return sb.toString();
  }

  public static String joinStringArray(String[] strArr) {
    return String.join("", strArr);
  }
}
