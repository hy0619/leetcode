package com.hy.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Hero
 * @version 1.0.0
 * @description 无重复最长子串的长度
 * @date 2021-6-12 12:58
 */
public class LengthOfLongestSubstr {

    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        for(int i = 0 ; i < chars.length ; i++){
            char firstChar = chars[i];
            char[] char1 = new char[chars.length - i ];
            char1[0] = firstChar;
            for(int j = i+ 1 ; j<chars.length ;j++){
                if(chars[j]!=char1[j-1]){  // 不再char1数组中
                   char1[]
                }
            }

        }
    }
}
