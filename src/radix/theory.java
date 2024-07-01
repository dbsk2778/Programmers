package radix;

public class theory {
    /*
      진법 변환 이론
    */

  public static void main(String[] args) {
    toRadix();
    System.out.println();
    toBinary(10);
    toOctal(10);
    toHexadecimal(10);
    toDecimal("A", 16);
  }

  // 문자열과 정수를 진법에 따라 변환하는 메서드
  public static void toRadix() {
    // Integer.parseInt(String s, int radix) -> s를 radix진수로 변환 (반환형 int)
    System.out.println(Integer.parseInt("10", 2));  // 2진수 -> 10진수
    // Integer.toString(int i, int radix) -> i를 radix진수로 변환 (반환형 String)
    System.out.println(Integer.toString(10, 2));  // 10진수 -> 2진수
    // Long.parseLong(String s, int radix) -> s를 radix진수로 변환 (반환형 long)
    System.out.println(Long.parseLong("10", 2));  // 2진수 -> 10진수
    // Long.toString(long l, int radix) -> l을 radix진수로 변환 (반환형 String)
    System.out.println(Long.toString(10, 2));  // 10진수 -> 2진수
  }

  public static void toBinary(int n) {
    if (n == 0) {
      return;
    }
    toBinary(n / 2);
    System.out.println(n % 2);
  }

  public static void toOctal(int n) {
    if (n == 0) {
      return;
    }
    toOctal(n / 8);
    System.out.println(n % 8);
  }

  public static void toHexadecimal(int n) {
    if (n == 0) {
      return;
    }
    toHexadecimal(n / 16);
    int remainder = n % 16;
    if (remainder >= 10) {
      System.out.println((char) (remainder + 55));
    } else {
      System.out.println(remainder);
    }
  }

  public static void toDecimal(String n, int radix) {
    int result = 0;
    for (int i = 0; i < n.length(); i++) {
      char c = n.charAt(i);
      if (c >= 'A' && c <= 'Z') {
        result = result * radix + (c - 55);
      } else {
        result = result * radix + (c - '0');
      }
    }
    System.out.println(result);
  }
}
