package cn.itcast.day04_常用api第一部分.Demo_07_Arrays数组工具类;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("请输入一段字符串：");
        String str1 = str.next();

        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]);
        }

    }
}
