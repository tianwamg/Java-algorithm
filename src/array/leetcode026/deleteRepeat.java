package array.leetcode026;

public class deleteRepeat {

    public static void main(String[] args) {
        int[] num = {0,0,1,1,1,2,2,3,3,4,4};
        int len = 0;
        for(int i=1;i<num.length;i++){
            if(num[i] != num[len]){
                len++;
                num[len] = num[i];

            }
        }
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
