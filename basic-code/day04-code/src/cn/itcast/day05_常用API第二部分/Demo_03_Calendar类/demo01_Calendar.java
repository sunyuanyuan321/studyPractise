package cn.itcast.day05_常用API第二部分.Demo_03_Calendar类;

import java.util.Calendar;

public class demo01_Calendar {
    public static void main(String[] args) {
        //Calendar抽象类，无法直接创建对象使用，里面有一个Static Calendar getInstance() 静态方法
        // Calendar类提供了一个类方法getInstance，返回一个Calendar类对象，原因：这些字段和方法被定义为protected
        //多态。用抽象父类，接受一个子类对象
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);
        //Calendar对象，get获取对应的信息
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH));
    }
}
