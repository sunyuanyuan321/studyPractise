package cn.itcast.day05_常用API第二部分.Demo_06_基本类型包装类;

import java.util.ArrayList;
import java.util.Arrays;

public class 自动装箱与拆箱 {
    public static void main(String[] args) {

        //基本数据类型 --> 字符串类型，一共三种方法
        //1、空连接
        int i = 34;
        String s = i + "";
        String S2 = 345 + "";
        //2、toString方法   数组转换字符串
        int[] array1 = {1, 2, 3, 4};
        char[] array2 = {'a', 'b', 'c'};
        String s3 = Arrays.toString(array1);
        String s4 = Arrays.toString(array2);
        System.out.println(s3 + "   " + s4);

        //从java 5开始，基本类型的包装类，装箱、拆箱动作可以自动完成
        Integer in = 4;  // = Integer in = new Integer(4);
        in +=5;  //
        System.out.println(in);
        //相当于
        Integer in2 = new Integer(4);
        System.out.println(in2.intValue()+5);
    }
}
