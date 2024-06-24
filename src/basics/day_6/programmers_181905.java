package basics.day_6;

public class programmers_181905 {

  /*
      프로그래머스 181905 : 문자열 뒤집기
  */
  public static void main(String[] args) {
    String my_string = "Progra21Sremm3";
    int s = 6;
    int e = 12;
    System.out.println(solution(my_string, s, e));

    String my_string2 = "Stanley1yelnatS";
    int s2 = 4;
    int e2 = 10;
    System.out.println(solution(my_string2, s2, e2));
  }

  public static String solution(String my_string, int s, int e) {
    StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
    sb.reverse();
    return my_string.substring(0, s) + sb + my_string.substring(e + 1);
  }

}
