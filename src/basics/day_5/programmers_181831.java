package basics.day_5;

public class programmers_181831 {

    /*
     * 프로그래머스 문제 : 특별한 이파원 배열 2 - 181831
     *  1. 이차원 배열 arr이 주어질 때, arr[i][j] = arr[j][i]를 만족하면 1을 반환하고, 그렇지 않으면 0을 반환
     */
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 0}, {1, 0, 1}, {0, 1, 0}};
        System.out.println(solution(arr));
    }


    public static int solution(int[][] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] != arr[j][i]) {
                    return 0; // 조건을 만족하지 않으면 0을 반환
                }
            }
        }

        return 1; // 모든 조건을 만족하면 1을 반환
    }
}
