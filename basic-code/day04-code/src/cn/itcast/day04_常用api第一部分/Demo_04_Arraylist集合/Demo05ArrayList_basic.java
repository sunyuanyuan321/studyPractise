package cn.itcast.day04_����api��һ����.Demo_04_Arraylist����;

import java.util.ArrayList;

public class Demo05ArrayList_basic {
    public static void main(String[] args) {
        //ArrayList ���� ���ܴ�� �����������ͣ���Ҫ��װ��
        //ArrayList<int> list = new ArrayList<>();   //����ʾ�������ĳ� Integer

        ArrayList<Integer> ListA = new ArrayList<>();
        ListA.add(100);
        ListA.add(200);
        ListA.add(300);
        System.out.println(ListA);
        //��ȡԪ��
        System.out.println(ListA.get(1));

        int num = ListA.get(2);
        System.out.println(num);
    }
}
