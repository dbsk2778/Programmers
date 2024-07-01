package basics.day_1;

public class programmers_181943 {

    // 문자열 겹쳐쓰기
    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
        System.out.println(solution2("He11oWor1d", "lloWorl", 2));
    }


    // 6번 테스트케이스에서 실패 - replace를 사용하면 중복되는 문자열이 있을 때, 모두 바뀌기 때문에 실패
    public static String solution(String my_string, String overwrite_string, int s) {

        return my_string.replace(my_string.substring(s, s + overwrite_string.length()), overwrite_string);
    }

    public static String solution2(String my_string, String overwrite_string, int s) {
        // substring 변수 하나일 때, 마지막 인덱스까지 전부 출력
        return my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
    }
}
