package cn.itcast.day04_常用api第一部分.Demo_05_String类;

public class Demo05_StringGet {
    public static void main(String[] args) {
        //字符串 长度
        int a = "abcdefg".length();
        System.out.println(a);
        System.out.println("eqddsdwqd".length());

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 =  str1.concat(str2);
        System.out.println(str3);

        //指定索引位置 单个字符
        System.out.println(str1.charAt(2));

        //查找首次出现  索引位置，没有则返回 -1
        System.out.println(str3.indexOf("llo"));
        System.out.println(str1.indexOf("ld"));   // -1
    }
}
