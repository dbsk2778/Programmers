package basics.day_8;

public class programmers_181871 {
    /*
        문제 설명
        프로그래머스 181871 + 문자열이 몇 번 등장하는지 세기
     */

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));
        System.out.println(solution2("banana", "ana"));
    }

    public static int solution(String myString, String pat) {
        int answer = 0;
        int patLen = pat.length();
        // patLen 길이의 문자열이 myString의 길이만큼 반복되는 경우 (patLen <= myString.length())
        for (int i = 0; i + patLen <= myString.length(); i++) {
            int maxIdx = i + patLen;
            if (maxIdx > myString.length()) {
                maxIdx = myString.length();
            }
            if (myString.substring(i, maxIdx).equals(pat)) {
                answer++;
            }
        }
        return answer;
    }

    public static int solution2(String myString, String pat) {
        int answer = 0;
        for(int i=0; i < myString.length(); i++) {
            if(myString.substring(i).startsWith(pat)){
                answer++;
            }
        }
        return answer;
    }
}
