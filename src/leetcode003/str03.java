package leetcode003;

public class str03 {

    public static void main(String[] args) {
        String s = "abcabcbb";
        int result = 0;
        int[] a = new int[256];
        for(int right=0,left=0;right<s.length();right++){
            char c = s.charAt(right);
            left = Math.max(a[c],left);
            result = Math.max(result,right-left+1);
            a[c] = right+1;
        }
        System.out.println(result);
    }
}
