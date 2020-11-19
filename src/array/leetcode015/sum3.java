package array.leetcode015;

import java.util.Arrays;

public class sum3 {

    public static void main(String[] args) {
        int[] nums = {-2,0,0,2,2};//1, 0, 1, 2, -1, -4
        Arrays.sort(nums);
        int len = nums.length;

        if(nums[0]>0 || nums[len-1]<0){
            return;
        }

        for(int i=0;i<len;i++){

            int target = 0-nums[i];
            int left = i+1;
            int right = len-1;

            if(nums[i] >0){
                break;
            }
            if(i==0 || nums[i] !=nums[i-1]){//去重
                while (left<right) {
                    if (target == nums[left] + nums[right]) {
                        System.out.println(nums[i] + ":" + nums[left] + ":" + nums[right]);
                        while (left < right && nums[left] == nums[left + 1]) {//去重
                            left++;
                        }
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;

                    } else if (target < nums[left] + nums[right]) {
                        right--;
                    } else {
                        left++;
                    }
                }
            }
        }
    }
}
