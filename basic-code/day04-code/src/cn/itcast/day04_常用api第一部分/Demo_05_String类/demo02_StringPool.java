package cn.itcast.day04_常用api第一部分.Demo_05_String类;

public class demo02_StringPool {
    public static void main(String[] args) {
        //字符串常量池

        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1==str2);  //ctrl+d  复制行
        System.out.println(str1==str3);
        System.out.println(str2==str3);

    }
}
