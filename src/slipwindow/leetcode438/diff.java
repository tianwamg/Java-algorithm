package slipwindow.leetcode438;

import java.util.ArrayList;
import java.util.List;

public class diff {

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        char[] sc = s.toCharArray();
        char[] pc = p.toCharArray();

        List<Integer> result = new ArrayList<>();//结果集

        int[] sArr = new int[26];
        int[] pArr = new int[26];

        for(char c :pc){
            pArr[c-'a']++;
        }

        for(int i=0;i<s.length();i++){
            if(i>=p.length()){
                sArr[sc[i-p.length()] - 'a']--;
            }
            sArr[sc[i] - 'a']++;
            if(isSame(pArr,sArr)){
                result.add(i-p.length()+1);
            }
        }

        for(int i=0;i<result.size();i++){
            System.out.println(result.get(i));
        }

    }

    public static boolean isSame(int[] a1,int[] a2){

        for(int i =0;i<a1.length;i++){
            if(a1[i] != a2[i]){
                return false;
            }
        }
        return true;
    }
}
