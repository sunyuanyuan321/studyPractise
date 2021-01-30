package cn.itcast.day05_常用API第二部分.Demo_03_Calendar类;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.Year;
import java.util.Calendar;

public class demo02_Calendar类常用方法 {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);
        System.out.println(ca.get(Calendar.YEAR));

        System.out.println("------------");
        demo01();
        System.out.println("===========");

        //设置年/月
        ca.set(Calendar.YEAR, 2222);
        ca.set(Calendar.MONTH, 10);
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH));
        System.out.println("222222222222222");

        //同时设置年月日
        ca.set(2000,5,15);
        System.out.println(ca.getTime());

        //把指定的字段，增加或者减少的值 add
        ca.add(Calendar.YEAR,2);
        System.out.println("使用add增加两年："+ca.get(Calendar.YEAR));

        ca.add(Calendar.YEAR,-3);
        System.out.println("使用add减少3年："+ca.get(Calendar.YEAR));


    }

    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);

        int date = c.get(Calendar.DATE);
        System.out.println(date);

    }


}
