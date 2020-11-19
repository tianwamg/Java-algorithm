package array.leetcode001;

import java.util.HashMap;
import java.util.Map;

public class sum2 {

    public static void main(String[] args) {
        int[] a = {2,7,11,3,9,0,1,6,8};
        int target = 9;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.length;i++){

            if(map.containsKey(target-a[i])){
                System.out.println(map.get(target-a[i])+":"+i);
            }
            map.put(a[i],i);

        }
    }
}
