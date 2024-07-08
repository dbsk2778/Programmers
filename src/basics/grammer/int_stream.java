package basics.grammer;

import java.util.Arrays;
import java.util.stream.IntStream;

public class int_stream {

    public static void main(String[] args) {
        intStream();
    }

    // intStream 사용법
    public static void intStream() {
        // 0 ~ 9까지 출력
        IntStream.range(0, 10).forEach(System.out::println);

        int[] collects = new int[]{1, 100, 45};
        int max_collect = 100;

        int[] result = IntStream.range(0, 3)
                .filter(i -> collects[i] == max_collect)
                .map(i -> i + 1)
                .toArray();

        int[] collects2 = new int[]{1, 100, 100};

        int[] result2 = IntStream.range(0, 3)
                .filter(i -> collects2[i] == max_collect)
                .map(i -> i + 1)
                .toArray();

        System.out.println(Arrays.toString(result)); // [2]
        System.out.println(Arrays.toString(result2)); // [2, 3]
    }
}
