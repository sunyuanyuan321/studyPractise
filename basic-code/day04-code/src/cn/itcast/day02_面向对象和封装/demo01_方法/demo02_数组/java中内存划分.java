package cn.itcast.day02_面向对象和封装.demo01_方法.demo02_数组;

/*
 java的内存划分为5个部分：
 1、栈 stack 存放方法中的局部变量；方法的运行一定要在栈当中运行
 局部变量：方法的参数，或者方法{}内的变量。
 作用域：一旦超过作用域，立刻从栈内存中消失。
 2、堆 heap 凡是new出来的东西，都在堆中   //new内存开辟地址
 堆内存存储，都有一个地址值：16进制
 堆内存里面的数据，都有默认值
     1、整数类型；默认值：0
     2、浮点类型，默认值：0.0
     3、字符类型，默认值：“/u0000”
     4、布尔类型，默认值：false
     5、引用类型，默认值：null
 3、方法区 method area：存储 .class相关信息，包含方法的信息。
 4、本地方法栈 native method stack：与操作系统相关
 5、寄存器 pc register：与cpu相关
  */
public class java中内存划分 {
    public static void main(String[] args) {
    int[] arrayA= new int[3];
        System.out.println(arrayA);
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("===============");

        arrayA[1]=10;
        arrayA[2]=20;
        System.out.println(arrayA);   //地址不变
        System.out.println(arrayA[0]);
        System.out.println(arrayA[1]);  //赋值后结果变了
        System.out.println(arrayA[2]);
        System.out.println("===============");

        int[] arrayB = arrayA;  //地址值给到arrayB，根本上是一个数组
        System.out.println(arrayB);
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);
        System.out.println(arrayB[2]);
        System.out.println("===============");

        arrayB[1]=100;
        arrayB[2]=200;
        System.out.println(arrayB);   //
        System.out.println(arrayB[0]);
        System.out.println(arrayB[1]);  //
        System.out.println(arrayB[2]);
        System.out.println("-----------------");

        System.out.println(arrayB[1]);
        System.out.println(arrayA[1]); //100,赋值也跟着变了
    }

}
