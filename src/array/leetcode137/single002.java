package array.leetcode137;

public class single002 {

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,99};
        int one =0,two = 0;
        for(Integer i : nums){
            one = ~two & (one ^ i);
            two = ~ one & ( two ^ i);
        }

        System.out.println(one);

    }
}
