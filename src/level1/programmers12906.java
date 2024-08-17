package level1;

import java.util.*;

public class programmers12906 {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));
        System.out.println(Arrays.toString(solution2(arr)));
    }

    public static int[] solution(int[] arr) {
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i : arr) {
            if (queue.isEmpty()) queue.addLast(i);
            else if (queue.getLast() != i) {
                queue.addLast(i);
            }
        }

        return queue.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] arr) {
        List<Integer> list = new ArrayList<>();
        // 1,000,000 이라는 자연수의 조건이 주어졌기 때문에 사용 가능 (preNum 이라는 이전 문자를 저장해놓은 변수 할당)
        int preNum = Integer.MIN_VALUE;

        for (int i : arr) {
            if (preNum != i) {
                list.add(i);
                preNum = i;
            }
        }

        return list.stream().mapToInt(i -> i).toArray();

    }
}
