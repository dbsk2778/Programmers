package str_algorithm.in_book.level_1;

public class programmers_141 {

  /*
    programmers p.141 / 81301
    숫자 문자열과 영단어
   */

  public static void main(String[] args) {
    System.out.println(solution("one4seveneight"));
    System.out.println(solution("23four5six7"));
    System.out.println(solution("2three45sixseven"));
    System.out.println("123");
  }

  public static int solution(String s) {
    String[] words = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    for (int i = 0; i < words.length; i++) {
      // if (s.contains(words[i])) { // if문 사용하지 않아도 됨
        // Integer.toString(i) == String.valueOf(i)
        s = s.replaceAll(words[i], String.valueOf(i));
      // }
    }
    return Integer.parseInt(s);
  }
}
