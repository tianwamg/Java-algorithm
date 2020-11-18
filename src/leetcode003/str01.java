package leetcode003;

import java.util.HashSet;
import java.util.Set;

public class str01 {
    public static void main(String[] args) {
        String s = "abcabcbb";
        Set<Character> set = new HashSet<>();
        int result=0,left=0,right=0;
        while (left<s.length() && right<s.length()){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                result = Math.max(result,right-left);
            }else {
                set.remove(s.charAt(left));
                left++;
            }
        }
        System.out.println(result);
    }
}
