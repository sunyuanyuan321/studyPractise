package cn.itcast.day04_常用api第一部分.Demo_02_匿名对象;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
        System.out.println("从键盘输入第一个数");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("普通方式，键盘输入的是：" + num);

        //匿名对象方式
        System.out.println("从键盘输入匿名对象的一个数");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("匿名方式，键盘输入的是：" + num2);

        //使用常规方法传入参数
        System.out.println("输入一个数，常规方法传入参数");
        Scanner sc1 = new Scanner(System.in);
        param.methodParam(sc1);

        //匿名对象最为方法参数
        System.out.println("输入匿名对象的一个数字,作为方法参数");
        Scanner sc2 = new Scanner(System.in);
        param.methodParam(sc2);


        //匿名对象作为返回值
        System.out.println("-----------------");
        System.out.println("匿名对象作为返回值的一个数：");
        Scanner sc3 = param.methodReturn();
        int num3 = sc3.nextInt();
        System.out.println("-----------------");
        System.out.println("返回值的这个数是："+num3);
    }

}
