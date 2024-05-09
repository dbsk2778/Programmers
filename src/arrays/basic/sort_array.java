package arrays.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sort_array
{
    
    public static void main (String[] args) {
        
        int[] num_list = { 12, 4, 15, 46, 38, 1, 14, 56, 32, 10 };
        
        System.out.println(Arrays.toString(solution(num_list)));
        System.out.println(Arrays.toString(solution(num_list)));
        System.out.println(Arrays.toString(solution(num_list)));
    }
    
    //정수로 이루어진 리스트 num_list가 주어집니다.
    // num_list에서 가장 작은 5개의 수를 제외한 수들을 오름차순으로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
    public static int[] solution (int[] num_list) {
        Arrays.sort(num_list);
        List<Integer> list = new ArrayList<>();
        
        for ( int i = 5; i < num_list.length; i++ )
            {
                list.add(num_list[i]);
            }
        
        int[] new_array = new int[list.size()];
        
        for ( int i = 0; i < list.size(); i++ )
            {
                new_array[i] = list.get(i);
            }
        
        return new_array;
    }
    
    public static int[] solution2 (int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        
        for (int i = 5 ; i < num_list.length ; i++) {
            answer[i-5] = num_list[i];
        }
        
        return answer;
    }
    
    public static int[] solution3 (int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list, 5, num_list.length);
    }
}
