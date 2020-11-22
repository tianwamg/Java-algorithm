package array.leetcode349;

import java.util.HashSet;
import java.util.Set;

public class intersection {

    public static void main(String args[]){
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        Set<Integer> s = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i])){
                s.add(nums2[i]);
            }
        }
        for(Integer i:s){
            System.out.print(i);
        }
    }
}
