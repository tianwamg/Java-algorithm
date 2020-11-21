package array.leetcode905;

public class oddEvenNum {

    public static void main(String args[]){
        int[] num = {1,2,3,4,5,6};
        int j =0;
        for(int i=0;i<num.length;i++){
            int temp;
            if(num[i]%2==0){
                temp = num[j];
                num[j] = num[i];
                num[i] = temp;
                j++;
            }
        }
    }
}
