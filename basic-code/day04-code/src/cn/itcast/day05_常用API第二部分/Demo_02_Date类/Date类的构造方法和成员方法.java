package cn.itcast.day05_����API�ڶ�����.Date��;

import javax.xml.soap.Detail;
import java.util.Date;

public class Date��Ĺ��췽���ͳ�Ա���� {
    public static void main(String[] args) {
        //��ǰʱ�䣬ת��Ϊ����ֵ
        System.out.println("��ǰʱ�䣬ת��Ϊ����ֵ:"+System.currentTimeMillis());
        demo01();
        demo02();

        System.out.println("-----------");
        //��Ҫ���� Date�����
        Date date = new Date();
        System.out.println(date);
        Long time = date.getTime();
        System.out.println("��ǰʱ��ת��Ϊ����ֵ"+time);

    }

    private static void demo01() {
        Date date = new Date();
        System.out.println("date�ղΣ���ȡϵͳ��ǰʱ�䣺"+date);
    }

    private static void demo02(){
        Date d1 = new Date(0L);
        System.out.println(d1);

        Date d2 = new Date(86400000L);  //����ֵת��Ϊdate����
        System.out.println("���� ����ֵ��Ĭ��ʱ��+����1��ĺ���ֵ��"+d2);
    }
}


