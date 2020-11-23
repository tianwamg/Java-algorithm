package array.leetcode136;

public class single {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int result = nums[0];
        for(int i=1;i<nums.length;i++){
            result = result^nums[i];
        }
        System.out.println(result);
    }
}
