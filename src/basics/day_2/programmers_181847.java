package basics.day_2;

public class programmers_181847 {

    // 0 떼기
    public static void main(String[] args) {
        System.out.println(solution("01033334444"));
        System.out.println(solution2("01033334444"));
    }

    public static String solution(String n_str) {
        String answer = "";
        for (int i = 0; i < n_str.length(); i++) {
            // 주의할 점 : charAt()으로 비교할 때는 '0'으로 비교해야 한다.
            if (n_str.charAt(i) != '0') {
                answer = n_str.substring(i);
                // 0이 아닌 수가 나오면 그 뒤는 더 이상 비교할 필요가 없기 때문에 break
                break;
            }
        }
        return answer;
    }

    public static String solution2(String n_str) {
        // 정수형으로 바꿔주면 앞에 0이 사라짐
        // return String.valueOf(Integer.parseInt(n_str));
        return "" + Integer.parseInt(n_str);
    }
}
