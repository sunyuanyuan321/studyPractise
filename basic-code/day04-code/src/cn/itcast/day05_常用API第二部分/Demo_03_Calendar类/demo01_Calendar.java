package cn.itcast.day05_����API�ڶ�����.Demo_03_Calendar��;

import java.util.Calendar;

public class demo01_Calendar {
    public static void main(String[] args) {
        //Calendar�����࣬�޷�ֱ�Ӵ�������ʹ�ã�������һ��Static Calendar getInstance() ��̬����
        // Calendar���ṩ��һ���෽��getInstance������һ��Calendar�����ԭ����Щ�ֶκͷ���������Ϊprotected
        //��̬���ó����࣬����һ���������
        Calendar ca = Calendar.getInstance();
        System.out.println(ca);
        //Calendar����get��ȡ��Ӧ����Ϣ
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH));
    }
}
