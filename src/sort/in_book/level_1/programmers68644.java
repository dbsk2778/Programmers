package sort.in_book.level_1;

import java.util.*;

public class programmers68644 {
    public static void main(String[] args) {
        int[] array = new int[]{2, 1, 3, 4, 1};
        System.out.println(Arrays.toString(solution(array)));
    }

    // HashSet 사용
    public static int[] solution(int[] array) {
        Set<Integer> set = new HashSet<>();
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                set.add(array[i] + array[j]);
            }
        }

//        int[] arr = set.stream().mapToInt(Integer::intValue).toArray();
//        Arrays.sort(arr);

        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] array) {
        Set<Integer> set = new TreeSet<>();
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                // TreeSet을 사용하면 add 하면서 정렬도 함께 됨 !!
                set.add(array[i] + array[j]);
            }
        }

        return set.stream().mapToInt(i -> i).toArray();
    }
}