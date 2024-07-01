package basics.day_6;

public class programmers_181829 {

  /*
    프로그래머스 181829 이차원 배열 대각선 순회하기
    i + j <= k를 만족하는 모든 (i, j)에 대한 board[i][j]의 합을 return
   */

    public static void main(String[] args) {
        System.out.println(solution(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 2));
        System.out.println(solution(new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}}, 2));
    }

    public static int solution(int[][] board, int k) {
        int answer = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i + j <= k) {
                    answer += board[i][j];
                }
            }
        }
        return answer;
    }

}
