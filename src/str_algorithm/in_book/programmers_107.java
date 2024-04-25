package str_algorithm.in_book;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class programmers_107 {

  public programmers_107() {
  }

  /*
     p. 107 / programmers_12932
     문제: 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴
  */
  public static void main(String[] args) throws IOException {
    System.out.println(Arrays.toString(solution()));
    System.out.println(Arrays.toString(solution(12345)));
  }

  public static int[] solution() throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] n = br.readLine().split("");
    int[] answer = new int[n.length];

    for (int i = 0; i < n.length; i++) {
      answer[i] = Integer.parseInt(n[n.length - i - 1]);
    }

    return answer;
  }

  // 문자열 풀이
  public static int[] solution(long n) {

    String str = Long.toString(n);

    // 문자열 뒤집기
    String reversed = new StringBuilder(str).reverse().toString();

    // 뒤집힌 문자열 배열로 반환
    char[] arr = reversed.toCharArray();

    int[] answer = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      // - '0'을 해주는 이유는 ? arr[i]는 char 타입이고, 이를 int 타입으로 변환하기 위해 '0'을 빼주는 것입니다.
      // 자바에서 char 타입의 숫자는 해당 숫자의 아스키 코드 값으로 저장되기 때문에 '0'을 빼주면 해당 숫자가 됩니다.
      // 따라서, '0'을 빼면 해당 숫자의 아스키 코드 값에서 '0'의 아스키 코드 값을 빼서 그 숫자의 정수 값을 얻을 수 있습니다.
      answer[i] = arr[i] - '0';
    }
    return answer;
  }
}
