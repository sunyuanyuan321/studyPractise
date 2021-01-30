package cn.itcast.day05_常用API第二部分.Demo_01_Object类.Object类_toString方法;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo02_Object类的toString方法 {

    public static void main(String[] args) {
        cn.itcast.day05_常用API第二部分.Object类.Object类_toString方法.Person str = new cn.itcast.day05_常用API第二部分.Object类.Object类_toString方法.Person("郭靖", 21);
        cn.itcast.day05_常用API第二部分.Object类.Object类_toString方法.Person str2 = new cn.itcast.day05_常用API第二部分.Object类.Object类_toString方法.Person("黄蓉", 18);

        //打印的是地址值，没有意义，想让打印字符串
        System.out.println(str.toString());  //Object类.Person@1540e19d

        //我们来看看其他的类，有没有重写 toString（）方法
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println(str1.toString());  //有被重写

        Random ran = new Random(10);
        int a = ran.nextInt();
        System.out.println(a);   //-1157793070   没有被重写

        ArrayList<Integer> arrays = new ArrayList<>();
        arrays.add(1);
        arrays.add(5);
        System.out.println(arrays);   //[1, 5] 重写过
    }
}