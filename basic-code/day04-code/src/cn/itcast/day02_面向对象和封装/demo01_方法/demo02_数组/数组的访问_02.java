package cn.itcast.day02_面向对象和封装.demo01_方法.demo02_数组;
/*
访问数组元素的格式：
数组名称[索引值]
索引值代表数组当中元素的编号，索引值从0开始，从长度-1结束；
 */

public class 数组的访问_02 {
    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4, 5};
        System.out.println(arrayA); //   [I@1540e19d,打印出来是内存地址，哈希值
        System.out.println(arrayA[0]);  //1
        System.out.println(arrayA[1]);
        System.out.println(arrayA[2]);
        System.out.println("-----------------");
        //数组的值，赋值给变量
        int num = arrayA[2];
        System.out.println(num);

        //动态初始化一个数组
        /*
        使用初始化数组时，元素会自动拥有一个默认值：
        1、整数类型；默认值：0
        2、浮点类型，默认值：0.0
        3、字符类型，默认值：“/u0000”
        4、布尔类型，默认值：false
        5、引用类型，默认值：null
         */
        int[] arrayB = new int [3];
        System.out.println(arrayB);
        System.out.println(arrayB[0]);  // 默认值为0
        //动态初始化赋值
        arrayB[2]=100;
        System.out.println(arrayB[2]);
    }
}
