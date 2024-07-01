package radix.in_book.level_1;

public class programmers_128 {
  /*
    p. 128 / programmers_68935 3진법 뒤집기
   */

  public static void main(String[] args) {
    System.out.println(solution(45));
    System.out.println(solution(125));
  }

  public static int solution(int n) {
    String s = Integer.toString(n, 3);
    StringBuilder reverseString = new StringBuilder(s).reverse();
    return Integer.parseInt(reverseString.toString(), 3);
  }

}
