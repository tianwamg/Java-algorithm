package array.leetcode137;

import java.util.HashSet;
import java.util.Set;

public class single {

    public static void main(String[] args) {
        int[] nums = {0,1,0,1,0,1,99};
        Set<Integer> set = new HashSet<>();
        int sum = 0,result =0;
        for(Integer i:nums){
            set.add(i);
            sum +=i;
        }
        for(Integer i:set){
            result += i;
        }
        System.out.println((3*result - sum)/2);
    }
}
