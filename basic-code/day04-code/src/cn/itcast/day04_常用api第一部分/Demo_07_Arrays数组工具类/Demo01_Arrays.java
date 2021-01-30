package cn.itcast.day04_常用api第一部分.Demo_07_Arrays数组工具类;

import java.util.Arrays;

public class Demo01_Arrays {
    public static void main(String[] args) {
        int [] intArrays = {10,20,30};
        String str = Arrays.toString(intArrays);
        System.out.println(str);

        //升序
        int[] array1 = {7,5,3,9};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

    }
}
