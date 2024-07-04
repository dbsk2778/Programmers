package basics.day_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers_181894 {

    /*
        문제 설명
        프로그래머스 181894 + 2가 연속으로 나오는 첫 번째 위치 찾기
     */

    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 2, 1, 3, 2, 2, 6};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(solution2(arr));
    }

    public static int[] solution(int[] arr) {
        // -1로 초기화 하는 이유는 인덱스가 0부터 시작하기 때문에
        int min = -1;  // 변수명 start
        int max = 0;  // 변수명 end

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (min == -1) {
                    min = i;
                } else {
                    max = i;
                }
            }
        }
        if (min == -1) return new int[]{-1};
        if (max == 0) max = min;
        int[] answer = new int[max - min + 1];

        //  for (int i = min; i <= max; i++) {
        //            answer[i - min] = arr[i];
        //        }

        if (max + 1 - min >= 0) {
            System.arraycopy(arr, min, answer, 0, max + 1 - min);
        }
        return answer;
    }

    public static List<Integer> solution2(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int start = -1;
        int end = -1;
        // 처음부터 시작
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        // 뒤에서부터 시작
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        if (start == -1 && end == -1) {
            answer.add(-1);
        } else {
            for (int i = start; i <= end; i++) {
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}
