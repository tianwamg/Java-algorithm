package array.leetcode004;

public class middle {

    public static void main(String[] args) {
        int[] nums1 = {1,4,5,6,7};
        int[] nums2 = {2,3,5,8,9,10};
        double result;
        if(nums2.length ==0){
            result = result(nums2,nums1);
        }
        result = result(nums1,nums2);
        System.out.println(result);
    }

    public static double result(int[] nums1,int[] nums2){
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(nums1.length==0){
            if(nums2.length % 2 ==0){
                return (nums2[len2 /2-1] + nums2[len2/2]) /2.0;
            }else {
                return nums2[len2/2];
            }
        }
        int[] num = new int[len1+len2];
        int count =0,i=0,j=0;
        while (count < len1+len2){
            if(i==len1){
                while (j<len2){
                    num[count++] = nums2[j++];
                }
                break;
            }
            if(j==len2){
                while ((i<len1)){
                    num[count++] = nums1[i++];
                }
                break;
            }
            if(nums1[i]<nums2[j]){
                num[count++] = nums1[i++];
            }else {
                num[count++] = nums2[j++];
            }
        }

        if(count %2==0){
            return (num[count/2-1]+num[count/2])/2.0;
        }
        return num[count/2];
    }
}
