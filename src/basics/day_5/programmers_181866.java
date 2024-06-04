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
    System.out.println(Arrays.toString(solution(myString2)));
  }

  public static String[] solution(String myString) {
    String[] splitArr = myString.split("x");
    ArrayList<String> resultList = new ArrayList<>();

    for (String str : splitArr) {
      // !str.equals("") or str.length() != 0
      if (!str.isEmpty()) {
        resultList.add(str);
      }
    }
    // new String[0]는 l.toArray 메서드에서 배열을 반환할 때 사용할 배열의 타입과 크기를 지정하는 역할을 합니다
    // new String[0]은 메서드에 전달되는 배열의 타입과 초기 크기를 나타냅니다. 여기서 크기가 0인 배열을 전달하지만, 실제로 반환되는 배열의 크기는 리스트 l의 크기에 맞춰서 동적으로 할당됩니다.
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
