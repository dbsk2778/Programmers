package radix.in_book.level_2;

public class programmers_131 {
  /*
    p. 131 / programmers_70129 이진 변환 반복하기
  */

  public static void main(String[] args) {
    int[] result = solution("110010101001");
    System.out.println(result[0] + " " + result[1]);
    int[] result2 = solution2("110010101001");
    System.out.println(result2[0] + " " + result2[1]);
  }

  public static int[] solution(String s) {
    int loop = 0;
    int removed = 0;

    // s가 1이 될 때까지 반복하며 0을 제거하고 0의 개수를 센다.
    while (!s.equals("1")) {
      loop++;
      int length = s.length();
      s = s.replaceAll("0", "");
      removed += length - s.length();
      s = Integer.toBinaryString(s.length());
    }
    return new int[]{loop, removed};
  }

  public static int[] solution2(String s) {
    int loop = 0;
    int removed = 0;

    while (!s.equals("1")) {
      int count = countZeros(s);
      loop += 1;
      removed += count;

      int ones = s.length() - count;
      s = Integer.toString(ones, 2);
    }
    return new int[]{loop, removed};
  }

  private static int countZeros(String s) {
    int count = 0;
    for (char c : s.toCharArray()) {
      if (c == '0') {
        count++;
      }
    }
    return count;
  }
}
