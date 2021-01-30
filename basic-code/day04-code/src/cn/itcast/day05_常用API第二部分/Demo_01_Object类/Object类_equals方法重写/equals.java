package cn.itcast.day05_常用API第二部分.Object类.Object类_equals方法重写;

import java.util.Random;

public class equals {
    public static void main(String[] args) {
        String str1 = "aabbcc";
        System.out.println("bbccaa".equals(str1));
        String str2 = "aabbcc";
        System.out.println(str2.equals(str1));

        /*
        equals 原码
        public boolean equals(Object obj) {
            return (this == obj);
        }
        */
        cn.itcast.day05_常用API第二部分.Object类.Object类_equals方法重写.Person per1 = new cn.itcast.day05_常用API第二部分.Object类.Object类_equals方法重写.Person("郭靖", 21);
        cn.itcast.day05_常用API第二部分.Object类.Object类_equals方法重写.Person per2 = new cn.itcast.day05_常用API第二部分.Object类.Object类_equals方法重写.Person("黄蓉", 21);
        cn.itcast.day05_常用API第二部分.Object类.Object类_equals方法重写.Person per3 = new cn.itcast.day05_常用API第二部分.Object类.Object类_equals方法重写.Person("黄蓉", 21);

        System.out.println(per2 + "          " + per3);
        System.out.println(per2.equals(per3));  //仍然是false，应为equals 比较的是 两个对象的地址值

        String str3 = per2.toString();
        String str4 = per3.toString();

        System.out.println("toString后比较：" + str3.equals(str4));//比较的是两个地址值

        System.out.println(per2.equals(per3));  //重写过 equals方法，现在是 ture

        Random ran = new Random(10);
        System.out.println(per1.equals(ran));  //ClassCastException ,不进行数据类型转换判断的话，报错
    }
}
