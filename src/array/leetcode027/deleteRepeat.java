package array.leetcode027;

import java.util.ArrayList;
import java.util.List;

public class deleteRepeat {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[result] = nums[i];
                result++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        System.out.println(result);
    }
}
