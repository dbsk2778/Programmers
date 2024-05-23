package basics.day_5;

import java.util.ArrayList;
import java.util.Arrays;
public class programmers_181866 {

  /*
   * 프로그래머스 문제 : 문자열 잘라서 정렬하기 - 181866
   *  1. 문자열 myString이 주어질 때, x를 기준으로 잘라서 정렬한 후 반환
   */
  public static void main(String[] args) {
    String myString = "axbxcxdxex";
    System.out.println(Arrays.toString(solution(myString)));
    myString = "dxccxbbbxaaaa";
    System.out.println(Arrays.toString(solution(myString)));


    String myString2 = "axbxcxdxex";
    System.out.println(Arrays.toString(solution2(myString2)));
    myString2 = "dxccxbbbxaaaa";
    System.out.println(Arrays.toString(solution(myString)));
  }

  public static String[] solution(String myString) {
    String[] splitArr = myString.split("x");
    ArrayList<String> resultList = new ArrayList<>();

    for (String str : splitArr) {
      if (!str.isEmpty()) {
        resultList.add(str);
      }
    }

    String[] resultArr = resultList.toArray(new String[0]);
    Arrays.sort(resultArr);

    return resultArr;
  }

  public static String[] solution2(String myString) {

    String[] strArr = myString.split("x");

    ArrayList<String> list = new ArrayList<>();

    for(String str : strArr){
      if(!str.isEmpty()){
        list.add(str);
      }
    }

    String[] result =  new String[list.size()];
    list.toArray(result);
    Arrays.sort(result);


    return result;
  }
}
