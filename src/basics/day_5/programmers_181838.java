package basics.day_5;

import java.time.LocalDate;
import java.util.Arrays;

public class programmers_181838 {

  /*
    프로그래머스 181838 - 날짜 비교하기
   */

  public static void main(String[] args) {
    int[] date1 = {2021, 12, 28};
    int[] date2 = {2021, 12, 29};
    System.out.println(solution(date1, date2));
    System.out.println(solution2(date1, date2));
    System.out.println(solution3(date1, date2));
  }

  public static int solution(int[] date1, int[] date2) {
    int answer = 0;
    if (date1[0] < date2[0]) {
      return 1;
    } else if (date1[0] == date2[0] && date1[1] < date2[1]) {
      return 1;
    } else if (date1[0] == date2[0] && date1[1] == date2[1] && date1[2] < date2[2]) {
      return 1;
    }
    return answer;
  }

  public static int solution2(int[] date1, int[] date2) {

    LocalDate new_date1 = LocalDate.of(date1[0], date1[1], date1[2]);
    LocalDate new_date2 = LocalDate.of(date2[0], date2[1], date2[2]);
    // LocalDate 형식에는 isBefore(), isAfter(), isEqual() 메서드가 있음 !!
    return new_date1.isBefore(new_date2) ? 1 : 0;
  }

  public static int solution3(int[] date1, int[] date2) {
    // 배열 값 비교 : date1이 date2보다 이르면 음수를 반환
    return Arrays.compare(date1, date2) < 0 ? 1 : 0;
  }
}
