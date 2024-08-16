package sort.in_book.level_1;

import java.util.Arrays;

public class programmers42748 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        System.out.println(Arrays.toString(solution(array, commands)));
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
//            int[] arr = getArrays(array, commands[i][0], commands[i][1]);
            int[] arr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2] - 1];
        }

        return answer;
    }

    // 부분 배열을 가져오는 메서드가 있는 것 같은데 = Arrays.copyOfRange(배열, from, to);
    public static int[] getArrays(int[] array, int i, int j) {
        int[] arr = new int[j - i + 1];
        int idx = 0;
        for (int n = i - 1; n < j; n++) {
            arr[idx] = array[n];
            idx++;
        }
        return arr;
    }
}
