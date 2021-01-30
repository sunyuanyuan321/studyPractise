package cn.itcast.day04_常用api第一部分.Demo_07_Arrays数组工具类;

import java.util.Arrays;

public class Arrays方法 {
    public static void main(String[] args) {
        //数组-->字符串  toString静态方法
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println(intArray);  //[I@1540e19d
        String s = java.util.Arrays.toString(intArray);  //[1, 2, 3, 4, 5]
        System.out.println(s);

        char[] chars2 = {'a','b','c'};
        String s1 = new String(chars2);
        System.out.println(s1);

        char[] chars = {'1','2','3'};
        String s2 = new String(chars);
        System.out.println(s2);  //123

        //数组-->字符串 默认格式
        String s3 = java.util.Arrays.toString(chars2);
        System.out.println(s3); // [a, b, c]
    }
}
