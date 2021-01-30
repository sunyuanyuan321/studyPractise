package cn.itcast.day04_常用api第一部分.Demo_05_String类.练习;

public class bbb {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};


        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                str = str + "word" + array[i] + "]";
            } else {
                str = str + "word" + array[i] + "#";
            }
        }
        System.out.println(str);

        String str1 = "aaa";
        str1=str1.concat("ddd");
        str1 = str1 + "bbb";
        str1=str1+"ccc";
        System.out.println(str1);


    }
}

