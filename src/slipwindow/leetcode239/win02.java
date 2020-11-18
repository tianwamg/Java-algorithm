package slipwindow.leetcode239;

import java.util.LinkedList;

/**
 * 双端队列
 */
public class win02 {

    public static void main(String[] args) {

        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;//窗口大小

        LinkedList<Integer> linkedList = new LinkedList<>();

        int[] win = new int[nums.length-k+1];

        for(int i=0;i<nums.length;i++){
            //保证从大到小，如果前面数小，弹出
            while (!linkedList.isEmpty() && nums[linkedList.peekLast()] <= nums[i]){
                linkedList.pollLast();
            }

            //添加当前值对应的数组下标
            linkedList.addLast(i);
            //初始化窗口，等到窗口长度为k时，下次移动删除过期数据
            if(linkedList.peek()<=i-k){
                linkedList.poll();

            }
            if(i-k+1>=0){
                win[i-k+1]=nums[linkedList.peek()];
            }

        }

        for(int i=0;i<win.length;i++){
            System.out.println(win[i]);
        }

    }

}
