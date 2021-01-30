package cn.itcast.day05_常用API第二部分.Object类.Objects类的equals方法;

import java.util.Objects;

public class Demo01_test {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.equals(s2));

        String s3 = null;
        String s4 = "abc";
           System.out.println(s3.equals(s4));  //空指针异常
        //引入  objects.equals（）工具类
        boolean result = Objects.equals(s3, s4);
        System.out.println(result);  //false



    }

}
