package level0;

import java.util.*;
public class programmers120886 {
    public static void main(String[] args) {
        System.out.println(solution1("olleh", "hello"));
        System.out.println(solution2("olleh", "hello"));
        System.out.println(solution3("olleh", "hello"));

        System.out.println(solution1("allpe", "apple"));
        System.out.println(solution2("allpe", "apple"));
        System.out.println(solution3("allpe", "apple"));
    }

    public static int solution1(String before, String after) {
        for (char c : before.toCharArray()) {
            after = after.replaceFirst(String.valueOf(c), "");
        }
        return after.isEmpty() ? 1 : 0;
    }

    public static int solution2(String before, String after) {
        char[] befores = before.toCharArray();
        char[] afters = after.toCharArray();

        Arrays.sort(befores);
        Arrays.sort(afters);

        return new String(befores).equals(new String(afters)) ? 1 : 0;
    }

    public static int solution3(String before, String after) {
        Map<Character, Integer> beforeMap = new HashMap<>();
        Map<Character, Integer> afterMap = new HashMap<>();

        for (char c : before.toCharArray()) {
            beforeMap.put(c, beforeMap.getOrDefault(c, 0) + 1);
        }

        for (char c : after.toCharArray()) {
            afterMap.put(c, afterMap.getOrDefault(c, 0) + 1);
        }

        // Map 비교 시 equals 사용 가능
        return beforeMap.equals(afterMap) ? 1 : 0;
    }

    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = 0;
        int difference = Math.abs(n - array[0]);

        for (int i = 1; i < array.length; i++) {
            if (Math.abs(n - array[i]) < difference) {
                answer = array[i];
            }
        }
        return answer;
    }
}
