package level0;

import java.util.Arrays;

public class programmers12933 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
        System.out.println(solution2(118372));
        System.out.println(solution3(118372));
    }

    // 처음 코드 : 매우 비효율적
    public static long solution(long n) {
        String[] strs = String.valueOf(n).split("");
        int[] arr = new int[strs.length];

        for (int i = 0; i < strs.length; i++) {
            arr[i] = Integer.parseInt(strs[i]);
        }

        long[] reverse = Arrays.stream(arr)
                .boxed()
                .sorted((v1, v2) -> v2 - v1)
                .mapToLong(i -> i)
                .toArray();

        StringBuilder sb = new StringBuilder();

        for (long i : reverse) {
            sb.append(i);
        }

        return Long.parseLong(sb.toString());
    }

    // 개선된 코드
    public static long solution2(long n) {
        String[] strs = String.valueOf(n).split("");
        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();

        for (String str : strs) sb.append(str);

        return Long.parseLong(sb.reverse().toString());
    }

    // 개선된 코드 2
    public static long solution3(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);

        StringBuilder sb = new StringBuilder(new String(chars));

        return Long.parseLong(sb.reverse().toString());
    }
}
