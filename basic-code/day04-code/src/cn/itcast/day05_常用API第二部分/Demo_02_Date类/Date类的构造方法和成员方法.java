package cn.itcast.day05_常用API第二部分.Date类;

import javax.xml.soap.Detail;
import java.util.Date;

public class Date类的构造方法和成员方法 {
    public static void main(String[] args) {
        //当前时间，转换为毫秒值
        System.out.println("当前时间，转换为毫秒值:"+System.currentTimeMillis());
        demo01();
        demo02();

        System.out.println("-----------");
        //需要创建 Date类对象
        Date date = new Date();
        System.out.println(date);
        Long time = date.getTime();
        System.out.println("当前时间转换为毫秒值"+time);

    }

    private static void demo01() {
        Date date = new Date();
        System.out.println("date空参，获取系统当前时间："+date);
    }

    private static void demo02(){
        Date d1 = new Date(0L);
        System.out.println(d1);

        Date d2 = new Date(86400000L);  //毫秒值转换为date日期
        System.out.println("传参 毫秒值，默认时间+传参1天的毫秒值："+d2);
    }
}


