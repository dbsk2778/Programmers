package basics.day_5;

public class programmers_181838 {

  /*
    프로그래머스 181838 - 날짜 비교하기
   */

  public static void main(String[] args) {
    int[] date1 = {2021, 12, 28};
    int[] date2 = {2021, 12, 29};
    System.out.println(solution(date1, date2));
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
}
