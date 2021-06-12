package com.hy.algorithm;

/**
 * @author Hero
 * @version 1.0.0
 * @description 无重复最长子串的长度
 * @date 2021-6-12 12:58
 */
public class LengthOfLongestSubstr {

    public static void main(String[] args) {
       String s = "abcabcabc";

        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        int maxLen = 1;
        for(int i = 0 ; i < chars.length ; i++){
            char[] char1 = new char[chars.length - i];
            char1[0] = chars[i];
            for(int j = i+ 1 ; j<chars.length ;j++){
               for(char c : char1){
                   if(c == chars[j]){
                       break;
                   }
               }
               //char1[j-i] = chars[i+1];
               maxLen = j-i;
            }


        }
        return maxLen;
    }

}
