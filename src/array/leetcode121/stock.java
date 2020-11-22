package array.leetcode121;

public class stock {

    public static void main(String args[]){
        //int[] a= {1,2,3,4,5,6,7};
        int[] a= {7,6,5,4,3,2,1};
        int min=a[0];
        int sum=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min =a[i];
            }
            sum = Math.max(a[i]-min,sum);
        }
        System.out.print(sum);
    }
}
