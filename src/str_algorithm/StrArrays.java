package str_algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrArrays
{
    // 문자열 함수 테스트
    public static void main(String[] args) {
        String str = "abc def ghi jkl mno pqr stu vwx yz";
        strArray1(str);
        strArray2(str);
        stringBuilderTest(str);
    
        String myString = "cvsgiorszzzmrpaqpe";
        int[] indexList = {16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7};
        
        System.out.println(charListTest(myString, indexList));
        System.out.println(charListTest2(myString, indexList));
    }
    
    public static void strArray1 (String str) {
        
        int length = str.split(" ").length;
        
        List<String> strs = new ArrayList<>(Arrays
                                                .asList(str.split(" "))
                                                .subList(
                                                    0,
                                                    length
                                                ));
        
        System.out.println(strs);
        System.out.println(strs.get(0)); // 리스트 인덱스
        System.out.println(strs.size()); // 리스트 길이
    }
    
    public static void strArray2 (String str) {
        char[] chars = str.toCharArray();
        System.out.println(chars);
        System.out.println(chars[0]); // 인덱스 사용 가능
        System.out.println(chars.length); // str의 길이는 length로 구할 수 있음
    }
    
    // my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.
    public static String charListTest (String myString, int[] indexList) {
        String answer = "";
        char[] charList = myString.toCharArray();
    
        for (int i = 0; i < indexList.length; i++) {
            answer += charList[indexList[i]];
        }
        return answer;
    }
    
    public static String charListTest2 (String myString, int[] indexList) {
        StringBuilder answer = new StringBuilder();
        char[] charList = myString.toCharArray();
    
        for ( int i : indexList )
            {
                answer.append(charList[i]);
            }
        return answer.toString();
    }
    
    
    public static void stringBuilderTest(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverseString = sb.reverse().toString();
        
        System.out.println(reverseString);
    }
    
    
}
