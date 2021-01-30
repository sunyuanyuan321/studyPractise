package cn.itcast.day02_面向对象和封装.demo01_方法.demo02_数组;

/*
 数组索引越界异常
 原因：索引编号写错了
 解决：修改成存在的正确索引编号
  */
public class 数组的越界异常_03 {
    public static void main(String[] args) {
        int[] array = {5, 15, 25};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        //数组索引越界异常
        System.out.println(array[3]);
        System.out.println("=============");
        //报错数组没有初始化
        int[] arrayA;
      //  System.out.println(arrayA[0]);

        //空指针异常 NullPointerException
        //原因：忘了 new初始化  解决：补上new
        int[] arrayB = null;   //控制指针 前提，数组仅赋值，却没有进行new创建  //内有开辟内存地址
        arrayB = new int[3];
        System.out.println(arrayB[0]); //NullPointerException
    }

}
