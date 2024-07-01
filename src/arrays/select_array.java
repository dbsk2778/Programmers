package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class select_array {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(1, 500)));
        System.out.println(Arrays.toString(solution2(1, 500)));
    }


    public static int[] solution(int l, int r) {

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i < 64; i++) {
            int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
            if (l <= num && num <= r) {
                list.add(num);
            }
        }

        return list.isEmpty()
                ? new int[]{-1}
                : list
                .stream()
                .mapToInt(i -> i)
                .toArray();
    }

    public static int[] solution2(int l, int r) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (isZeroFiveNumber(i)) {
                resultList.add(i);
            }
        }

        if (resultList.isEmpty()) {
            return new int[]{-1};
        } else {
            return resultList.stream().mapToInt(Integer::intValue).toArray();
        }
    }

    private static boolean isZeroFiveNumber(int num) {
        String strNum = Integer.toString(num);
        for (char c : strNum.toCharArray()) {
            if (c != '0' && c != '5') {
                return false;
            }
        }
        return true;
    }

    public int[] solution3(int[] arr, int[][] intervals) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int[] interval : intervals) {
            for (int i = interval[0]; i <= interval[1]; i++)
                arrayList.add(arr[i]);
        }

        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }

    public int[] solution4(int[] arr, int[][] intervals) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                list.add(arr[j]);
            }
        }

        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
