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
    
    public static void stringBuilderTest(String str) {
        StringBuilder sb = new StringBuilder(str);
        String reverseString = sb.reverse().toString();
        
        System.out.println(reverseString);
    }
}
