package cn.itcast.day05_����API�ڶ�����.Demo_03_Calendar��;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.Year;
import java.util.Calendar;

public class demo02_Calendar�ೣ�÷��� {
    public static void main(String[] args) {
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);
        System.out.println(ca.get(Calendar.YEAR));

        System.out.println("------------");
        demo01();
        System.out.println("===========");

        //������/��
        ca.set(Calendar.YEAR, 2222);
        ca.set(Calendar.MONTH, 10);
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH));
        System.out.println("222222222222222");

        //ͬʱ����������
        ca.set(2000,5,15);
        System.out.println(ca.getTime());

        //��ָ�����ֶΣ����ӻ��߼��ٵ�ֵ add
        ca.add(Calendar.YEAR,2);
        System.out.println("ʹ��add�������꣺"+ca.get(Calendar.YEAR));

        ca.add(Calendar.YEAR,-3);
        System.out.println("ʹ��add����3�꣺"+ca.get(Calendar.YEAR));


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
