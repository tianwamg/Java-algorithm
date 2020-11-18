package leetcode239;

public class win01 {

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;//窗口大小
        int len = nums.length;
        int[] win = new int[len-k+1];
        //遍历所有的滑动窗口
        for(int i=0;i<win.length;i++){
            int max = Integer.MIN_VALUE;
            //找到每个窗口的最大值
            for(int j=i;j<i+k;j++){
                max = Math.max(max,nums[j]);
            }
            win[i] = max;
        }

        for(int i=0;i<win.length;i++){
            System.out.print(win[i]);
        }

    }
}
