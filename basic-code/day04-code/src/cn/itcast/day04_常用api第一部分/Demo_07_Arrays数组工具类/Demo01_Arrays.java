package cn.itcast.day04_����api��һ����.Demo_07_Arrays���鹤����;

import java.util.Arrays;

public class Demo01_Arrays {
    public static void main(String[] args) {
        int [] intArrays = {10,20,30};
        String str = Arrays.toString(intArrays);
        System.out.println(str);

        //����
        int[] array1 = {7,5,3,9};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

    }
}
