package array.leetcode004;

public class middle002 {

    public static void main(String[] args) {
        int[] nums1 = {1,4,5,6,7};
        int[] nums2 = {2,3,5,8,9,10};

        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1+len2;
        int left =0,right=0;
        int a=0,b=0;
        for(int i=0;i<= len/2;i++){
            left =right;
            if(a<len1 && (b>=len2 || nums1[a] < nums2[b])){
                right = nums1[a++];
            }else {
                right = nums2[b++];
            }
        }
        if((len & 1)==0){
            System.out.println((left+right)/2.0);
        }else {
            System.out.println(right);
        }
    }
}
