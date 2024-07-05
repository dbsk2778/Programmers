package basics.day_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class programmers_181897 {

    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/181897
        리스트 자르기
    */

    public static void main(String[] args) {
        int[] slicer = {1, 3, 2};
        int[] num_list = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solution(1, slicer, num_list)));
        System.out.println(Arrays.toString(solution(2, slicer, num_list)));
        System.out.println(Arrays.toString(solution(3, slicer, num_list)));
        System.out.println(Arrays.toString(solution(4, slicer, num_list)));

        System.out.println(Arrays.toString(solution2(1, slicer, num_list)));
        System.out.println(Arrays.toString(solution2(2, slicer, num_list)));
    }

    public static int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        int[] answer = {};
        switch (n) {
            case 1:
                answer = Arrays.copyOf(num_list, b + 1);
//                answer = Arrays.copyOfRange(num_list, 0, b + 1);
                break;
            case 2:
                answer = Arrays.copyOfRange(num_list, a, num_list.length);
                break;
            case 3:
                answer = Arrays.copyOfRange(num_list, a, b + 1);
                break;
            case 4:
                List<Integer> l = new ArrayList<>();
                for (int i = a; i <= b; i += c) {
                    l.add(num_list[i]);
                }
                answer = l.stream().mapToInt(i -> i).toArray();
                break;
        }

        return answer;
    }

    public static int[] solution2(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        for (int i = start, j = 0; i <= end; i += step) {
            answer[j++] = num_list[i];
        }
        return answer;
    }
}
