package basics.day_5;

public class programmers_181898 {

    /*
      프로그래머스 181898 가까운 1찾기
     */
    public static void main(String[] args) {
        System.out.println(solution(new int[]{0, 0, 0, 1}, 1));
    }

    public static int solution(int[] arr, int idx) {
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i >= idx && arr[i] == 1) {
                answer = i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }

    public static int solution2(int[] arr, int idx) {
        int answer = -1;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}
