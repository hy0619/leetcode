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
        System.out.println(getMinSquareNum(104 , 0));
    }



    /**
     * @description: TODO
    if(result < 1 || result > 10000){
    return null;
    }
     * @return: java.lang.Integer
     * @author: Hero
     * @date: 2021/6/11
     */
    public static Integer getMinSquareNum(Integer result , Integer count){
        if(isPerfectSquare(result)) {
            return count + 1 ;
        }else{
            Integer res = getCycles(result);
            for(int i = 1 ; i <= res ; i++){
                Integer j = getCycles(result -pow2(i));
               return  getMinSquareNum(j , count + 1);
            }
            return null;
        }
    }


    public final static boolean isPerfectSquare(Integer n) {
        if (n < 0){
            return false;
        }

        long tst = (long)(Math.sqrt(n) + 0.5);
        return tst*tst == n;
    }




    private static Integer getCycles(int result){
        double sqrt = Math.sqrt(result);
        Double floor = Math.ceil(sqrt);
        return floor.intValue();
    }



    private static Integer pow2(Integer num){
        Double d =  Math.pow(num,2);
        return d.intValue();
    }

}
