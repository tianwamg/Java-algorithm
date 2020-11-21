package array.leetcode054;

import java.util.ArrayList;
import java.util.List;

public class screw {

    public static void main(String args[]){
        int[][] nums = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int rows = nums.length;//行
        int column = nums[0].length;//列

        List<Integer> list = new ArrayList<>();

        int left = 0,right = column-1;
        int top = 0,down = rows-1;
        while (list.size() <rows * column) {
            //最上
            for (int i = left; i <= right; i++) {
                list.add(nums[top][i]);
            }
            top++;
            //最右
            if(list.size() < rows * column) {
                for (int i = top; i <= down; i++) {
                    list.add(nums[i][right]);
                }
                right--;
            }
            //最下
            if (list.size() < rows * column) {
                for (int i = right; i >= left; i--) {
                    list.add(nums[down][i]);
                }
                down--;
            }

            //最左
            if (list.size() < rows * column) {
                for (int i = down; i >= top; i--) {
                    list.add(nums[i][left]);
                }

                left++;
            }
        }

        System.out.print(list.size());
    }
}
