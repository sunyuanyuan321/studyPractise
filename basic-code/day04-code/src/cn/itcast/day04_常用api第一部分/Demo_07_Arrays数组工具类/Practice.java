package cn.itcast.day04_����api��һ����.Demo_07_Arrays���鹤����;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("������һ���ַ�����");
        String str1 = str.next();

        char[] chars = str1.toCharArray();
        Arrays.sort(chars);
        System.out.println(Arrays.toString(chars));

        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]);
        }

    }
}
