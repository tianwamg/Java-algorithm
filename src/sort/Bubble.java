package sort;

/**
 * 冒泡排序
 */
public class Bubble {

    public static void main(String[] args) {
        int[] a = { 12, 20, 5, 16, 15, 1, 30, 45, 23, 9 };
        int temp;
        for(int i=0;i<a.length-1;i++){
            for(int j = 0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
