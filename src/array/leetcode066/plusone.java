package array.leetcode066;

public class plusone {

    public static void main(String args[]){
        int[] nums={9,9,9,9,9};
        int i = nums.length-1;
        if(nums[i]<9){
            nums[i]++;
        }else {
            while (i>0){
                nums[i]=0;
                i--;
                if(nums[i]<9){
                    nums[i]++;
                    break;
                }
            }
            if(i==0 && nums[0]==9){
                nums[0]=10;
            }

        }

        for(int j=0;j<nums.length;j++){
            System.out.print(nums[j]+",");
        }
    }

}
