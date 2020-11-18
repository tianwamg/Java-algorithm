package leetcode003;

import java.util.HashMap;
import java.util.Map;

public class str02 {

    public static void main(String[] args) {
        String s = "abcdbcbb";
        Map<Character,Integer> map = new HashMap<>();
        int result = 0;
        for(int right=0,left=0;right<s.length();right++){
            if(map.containsKey(s.charAt(right))){
                left = Math.max(map.get(s.charAt(right)),left);
            }
            result = Math.max(result,right-left+1);
            map.put(s.charAt(right),right+1);
        }
        System.out.println(result);
    }
}
