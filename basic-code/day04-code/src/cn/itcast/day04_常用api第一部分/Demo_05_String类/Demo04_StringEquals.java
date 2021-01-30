package cn.itcast.day04_常用api第一部分.Demo_05_String类;

public class Demo04_StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        //地址值的比较
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println("=======================");

        //equals方法，两个字符串对象内容比较
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));

        //字符串比较对象
        System.out.println("Hello".equals(str1));
        System.out.println(str1.equals("Hello"));

        //equals方法，严格区分大小写
        String str4 = "hello";
        System.out.println(str1.equals(str4));   //false

        //推荐使用 "Hello".equals(str1)
        String str5 = null;
        System.out.println("Hello".equals(str5));  //false
        System.out.println(str5.equals("Hello"));  //报错 空指针  NullPointerException


    }
}
