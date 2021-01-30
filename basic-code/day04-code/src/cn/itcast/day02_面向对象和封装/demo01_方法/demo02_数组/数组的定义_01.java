package cn.itcast.day02_面向对象和封装.demo01_方法.demo02_数组;
/*
数组的概念：是一种容器，可以同时存放多个数据值。

两种常见的初始化方式：
1、动态初始化，指定长度；
2、静态初始化，指定内容；

数组的特点：
1、数组是一种引用数据类型
2、数组中的数据类型，必须一致
3、数组的长度在程序运行期间不可改变

两种初始化数组的格式：
数据类型[] 数组名称 = new 数据类型 [数组长度];
int[] arrayA = new int [300];
数组类型  []代表数组  数组名称  new关键字（创建数组的动作）

数组的省略格式：
  int[] arrayD = {1, 2, 3, 4, 5};
注意，静态初始化一旦使用省略格式，就不能拆分两个步骤了

使用建议：
如果不确定数组当中的具体内容，用动态初始化；
已经确定具体内容，用静态初始化；
*/

public class 数组的定义_01 {
    public static void main(String[] args) {
        //这里都是动态初始化
        int[] arrayA = new int[300];
        double[] arrayB = new double[10];
        String[] arrayC = new String[5];

        //这里是静态初始化
        int[] arrayD = new int[]{5, 15, 25};
        String[] arrayE = new String[]{"Hello", "Word", "java"};

        //静态初始化标准格式,可以拆分成两个步骤
        int[] arrayJ;
        arrayJ=new int[]{11,22,33};
        //动态初始化，也可以拆分成两个步骤
        int[] arrayK;
        arrayK=new int[5];

        //数组的省略格式，不能拆分步骤
        int[] arrayW = {1, 2, 3, 4, 5};
    }


}
