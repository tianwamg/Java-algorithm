package array.leetcode189;

public class reversek002 {

    public static void main(String args[]) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        k %= a.length;
        reverser(a,0,a.length-1);
        reverser(a,0,k-1);
        reverser(a,k,a.length-1);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

    }

    public static void reverser(int[] nums,int start,int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            end--;
            start++;
        }
    }
}
