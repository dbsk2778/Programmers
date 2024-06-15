package basics.day_6;

public class programmers_181900 {

  /*
    프로그래머스 181900 : 글자 지우기
   */

  public static void main(String[] args) {
    String my_string = "abcde";
    int[] indices = {1, 2, 3};
    System.out.println(solution(my_string, indices));
    System.out.println(solution2(my_string, indices));
  }

  public static String solution(String my_string, int[] indices) {
    StringBuilder sb = new StringBuilder();
    char[] arr = my_string.toCharArray();
    for (int i : indices) {
      // char 값은 '' 빈 값으로 넣을 수 없기 때문에 ' ' 공백으로 대체
      arr[i] = ' ';
    }
    for (char c : arr) {
      if (c != ' ') {
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public static String solution2(String my_string, int[] indices) {
    String[] arr = my_string.split("");
    for (int i : indices) {
      arr[i] = "";
    }
    return String.join("", arr);
  }
}
