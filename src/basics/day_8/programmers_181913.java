package basics.day_8;

public class programmers_181913 {

    /*
        https://school.programmers.co.kr/learn/courses/30/lessons/181913
        문자열 여러 번 뒤집기
     */

    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

        System.out.println(solution(my_string, queries));
        System.out.println(solution2(my_string, queries));
    }

    public static String solution(String my_string, int[][] queries) {
        char[] arr;
        arr = my_string.toCharArray();

        for (int[] query : queries) {
            reverse(arr, query[0], query[1]);
        }

        return new String(arr);
    }

    private static void reverse(char[] arr, int s, int e) {
        while (s < e) {
            char temp = arr[s];
            arr[s++] = arr[e];
            arr[e--] = temp;
        }
    }

    public static String solution2(String my_string, int[][] queries) {
        String answer = my_string;
        for (int[] query : queries) {
            StringBuilder sb = new StringBuilder();
            int s = query[0];
            int e = query[1];

            String startStr = answer.substring(0, s);
            String reveresedStr = sb.append(answer, s, e + 1).reverse().toString();
            String endStr = answer.substring(e + 1);

            answer = startStr + reveresedStr + endStr;
        }
        return answer;
    }
}
