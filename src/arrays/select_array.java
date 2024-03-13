package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class select_array
{
    
    public static void main (String[] args) {
        System.out.println(Arrays.toString(solution(1, 500)));
        System.out.println(Arrays.toString(solution2(1, 500)));
    }
    
    
    public static int[] solution (
        int l,
        int r
    ) {
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for (int i = 1; i < 64; i++ )
            {
                int num = Integer.parseInt(Integer.toBinaryString(i)) * 5;
                if ( l <= num && num <= r )
                    {list.add(num);}
            }
        
        return list.isEmpty()
               ? new int[] { -1 }
               : list
                   .stream()
                   .mapToInt(i -> i)
                   .toArray();
    }
    
    public static int[] solution2 (int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (
            int i = l;
            i <= r;
            i++
        )
            {
                String str = String.valueOf(i);
                boolean flag = false;
                for (int j = 0;j < str.length();j++)
                    {
                        char c = str.charAt(j);
                        if ( c != '0' && c != '5' )
                            {
                                flag = true;
                                break;
                            }
                    }
                if ( !flag ) list.add(i);
            }
        if ( list.size() == 0 )
            {
                int[] answer = new int[1];
                answer[0] = -1;
                return answer;
            }
        int[] answer = new int[list.size()];
        
        for (int i = 0; i < list.size(); i++ )
            {
                answer[i] = list.get(i);
            }
        return answer;
    }
}
