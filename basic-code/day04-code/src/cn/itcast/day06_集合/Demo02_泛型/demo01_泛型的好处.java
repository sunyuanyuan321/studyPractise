package cn.itcast.day06_����.Demo02_����;

import jdk.nashorn.internal.ir.LiteralNode;

import java.util.ArrayList;
import java.util.Iterator;

public class demo01_���͵ĺô� {
    public static void main(String[] args) {
        //��ʹ�÷���
        ArrayList list = new ArrayList();
        list.add("abc");  //�̳е���object�࣬���е���������
        list.add(3);
        System.out.println(list);

        //���õ���������
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

            //���ʹ��String�������еķ���������length��������Ҫ����ת�ͣ�int�����޷�����ת�ͣ�����
            String s =(String)it.next();  //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
            System.out.println(s);
        }
    }
}
