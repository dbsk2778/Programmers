package str_algorithm.in_book.level_1;

public class programmers_114 {

  /*
      이상한 문자 만들기 (p. 114 / programmers_12930)
      문제: 문자열 s에 나타나는 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴
   */

    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
        System.out.println(solution2("try hello world"));
        System.out.println(solution3("try hello world"));
    }

    // 공백 기준으로 단어를 나누고, 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 변환
    // 실패하는 테스트 케이스 존재, 아마 공백이 여러 개인 경우일 것으로 추정
    public static String solution(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String n : arr) {
            for (int i = 0; i < n.length(); i++) {
                if (i % 2 == 0) {
                    sb.append(Character.toUpperCase(n.charAt(i)));
                } else {
                    sb.append(Character.toLowerCase(n.charAt(i)));
                }
            }
            sb.append(" ");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    // index 값 사용
    public static String solution2(String n) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for (char c : n.toCharArray()) {
            if (Character.isSpaceChar(c)) {
                sb.append(" ");
                index = 0;
            } else {
                if (index % 2 == 0) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                index++;
            }
        }
        return sb.toString();
    }

    // boolean 값 사용
    public static String solution3(String s) {
        boolean isUpper = true;
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (!Character.isAlphabetic(c)) {
                sb.append(c);
            } else {
                if (isUpper) {
                    sb.append(Character.toUpperCase(c));
                } else {
                    sb.append(Character.toLowerCase(c));
                }
                isUpper = !isUpper;
            }
        }
        return sb.toString();
    }
}
