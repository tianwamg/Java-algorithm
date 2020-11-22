package array.leetcode189;

public class reversek {

    public static void main(String args[]){
        int[] a = {1,2,3,4,5,6,7};
        int k=3;
        int len = a.length;
        for(int i=1;i<=k;i++){
            int temp = a[len-1];
            for(int j=len-1;j>0;j--){
                a[j] = a[j-1];
            }
            a[0]=temp;
        }
        for(int i=0;i<len;i++) {
            System.out.print(a[i]);
        }
    }
}
