package cn.itcast.day05_常用API第二部分.Demo_04_Sysrem类;

import java.util.Calendar;
import java.util.Date;

public class demo01_System {
    public static void main(String[] args) {
        /*
        static long currentTimeMillis()
          返回以毫秒为单位的当前时间。
          用来测试程序的效率
         */
        System.out.println(System.currentTimeMillis());
        Date date = new Date(System.currentTimeMillis());
        System.out.println(date);

        //获取当前时间，方法一：
        Date date1 = new Date();
        System.out.println("获取当前时间，方法一："+date1);

        //获取当前时间，方法二：
        Calendar ca =Calendar.getInstance();
        System.out.println("获取当前时间，方法二："+ca.getTime());

        /*
        public static void arraycopy(Object src,
                             int srcPos,
                             Object dest,
                             int destPos,
                             int length)从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束。
            参数：
src - 源数组。
srcPos - 源数组中的起始位置。
dest - 目标数组。
destPos - 目标数据中的起始位置。
length - 要复制的数组元素的数量。 
         */


    }
}
