package cn.itcast.day02_面向对象和封装.demo02_面向对象和封装;

import java.util.Arrays;
//导包，JDK自带，会自动导入
/*
三大基本特征--封装，继承，多态

类： 是一组相关 属性 和 行为 的集合
对象： 是一类事物的具体体现，对象是类的一个实例
举例： 小猫
对象：一只小猫
属性：名字，年龄，体重，颜色……
行为：吃饭，睡觉，做游戏……

 */
public class 面向对象思想的举例_01 {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        //面向过程举例，打印数组为 [10,20,30,40,50]
        //特点：面向过程，每一个步骤细节都要亲力亲为
        System.out.print("[");
        for (int i = 0; i < 5; i++) {
            if (i < array.length - 1) {
                System.out.print(array[i] + ",");
            }
            else    {
                System.out.println(array[i]+"]");
            }
        }

        //面向对象举例，找一个JDK给我们提供好的 Arrays 类
        // 其中有一个toString 方法，拿来用
        System.out.println(Arrays.toString(array));


    }
}
