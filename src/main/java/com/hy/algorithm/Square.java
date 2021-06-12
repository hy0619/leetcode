package com.hy.algorithm;

/**
 * @author Hero
 * @description
 * 给定正整数n，找到若干个完全平方数（比如1, 4, 9, 16, ...）使得它们的和等于 n。
 * 你需要让组成和的完全平方数的个数最少。
 *
 * 给你一个整数 n ，返回和为 n 的完全平方数的 最少数量 。
 *
 * 完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，
 * 其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
 *
 **/
public class Square {

    public static void main(String[] args) {
        System.out.println(numSquares(13 ));
    }

    public static int numSquares(int n){
        int[] f = new int[n + 1];
        for(int i = 1 ; i<=n ; i++){ //1  2
            int minn = Integer.MAX_VALUE;
            for(int j = 1 ; j*j <= i  ; j++){ //  [1, 根号i]
                minn= Math.min(minn , f[i - j*j]); // min(max, f[0])
            }
            f[i] = minn +1 ; //f[1] = 1;  f[2] =
        }
        return  f[n];

    }

}
