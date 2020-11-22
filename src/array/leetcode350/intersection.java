package array.leetcode350;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class intersection {

    public static void main(String args[]){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(Integer i :nums1){
            int count = map.getOrDefault(i,0)+1;
            map.put(i,count);
        }
        for(Integer i:nums2){
            int count = map.getOrDefault(i,0);
            if(count >0){
                list.add(i);
                count--;
                if(count>0){
                    map.put(i,count);
                }else {
                    map.remove(i);
                }
            }
        }

        for(Integer i: list){
            System.out.print(i);
        }
    }
}
