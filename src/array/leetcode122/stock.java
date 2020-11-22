package array.leetcode122;

public class stock {

    public static void main(String args[]){
        int[] a= {1,2,3,4,5};
        int sum=0;
        for(int i =1;i<a.length;i++){
            if(a[i]-a[i-1]>0){
                sum += a[i]-a[i-1];
            }
        }
        System.out.print(sum);
    }
}
