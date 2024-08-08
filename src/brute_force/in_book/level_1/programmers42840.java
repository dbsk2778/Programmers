package brute_force.in_book.level_1;

import java.util.stream.IntStream;

public class programmers42840 {
    public static void main(String[] args) {
        solution(new int[]{1, 2, 3, 4, 5});
        solution(new int[]{1, 3, 2, 4, 2});
    }

    public static int[] solution(int[] answer) {
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] counts = new int[3];

        for (int i = 0; i < answer.length; i++) {
            int index = i % 5;

            if (answer[i] == a[index]) counts[0]++;
            if (answer[i] == b[index]) counts[1]++;
            if (answer[i] == c[index]) counts[2]++;
        }

        int maxCount = Integer.MIN_VALUE;

        for (int count : counts) {
            if (count > maxCount) maxCount = count;
        }

        // stream의 filter method를 사용할 때 해당 변수의 값이 변경되면 안되므로 final 써줘야 함
        final int max = maxCount;
        // 이렇게 해줘도 됨
        // int max = Arrays.stream(counts).max().orElse(-1);

        return IntStream.range(0, 3)
                .filter(i -> max == counts[i])
                .map(i -> i + 1)
                .toArray();

    }
}
