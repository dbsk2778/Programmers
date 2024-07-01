package basics.day_1;

public class programmers_181949 {

    // 대소문자 바꿔서 출력하기
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            }
            if (Character.isLowerCase(c)) {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
}
