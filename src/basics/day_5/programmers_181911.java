package basics.day_5;

public class programmers_181911 {

    public static void main(String[] args) {
        String[] my_strings = {"abcde", "qwer"};
        int[][] parts = {{2, 4}, {2, 3}};
        System.out.println(solution(my_strings, parts));
    }

    public static String solution(String[] my_strings, int[][] parts) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            sb.append(my_strings[i], parts[i][0], parts[i][1] + 1);
        }
        return sb.toString();
    }
}
