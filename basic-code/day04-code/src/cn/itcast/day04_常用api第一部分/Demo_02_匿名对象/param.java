package cn.itcast.day04_常用api第一部分.Demo_02_匿名对象;

import java.util.Scanner;

public class param {
    public static void methodParam(Scanner sc2){
        int num=sc2.nextInt();
        System.out.println("方法参数输入的是："+num);
    }

    public static Scanner methodReturn(){
        //普通情况
       // Scanner sc = new Scanner(System.in);
       // return sc;

        //匿名对象
        return new Scanner(System.in);
    }
}
