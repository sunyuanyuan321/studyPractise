package cn.itcast.day05_����API�ڶ�����.Demo_06_�������Ͱ�װ��;

import java.util.ArrayList;
import java.util.Arrays;

public class �Զ�װ������� {
    public static void main(String[] args) {

        //������������ --> �ַ������ͣ�һ�����ַ���
        //1��������
        int i = 34;
        String s = i + "";
        String S2 = 345 + "";
        //2��toString����   ����ת���ַ���
        int[] array1 = {1, 2, 3, 4};
        char[] array2 = {'a', 'b', 'c'};
        String s3 = Arrays.toString(array1);
        String s4 = Arrays.toString(array2);
        System.out.println(s3 + "   " + s4);

        //��java 5��ʼ���������͵İ�װ�࣬װ�䡢���䶯�������Զ����
        Integer in = 4;  // = Integer in = new Integer(4);
        in +=5;  //
        System.out.println(in);
        //�൱��
        Integer in2 = new Integer(4);
        System.out.println(in2.intValue()+5);
    }
}
