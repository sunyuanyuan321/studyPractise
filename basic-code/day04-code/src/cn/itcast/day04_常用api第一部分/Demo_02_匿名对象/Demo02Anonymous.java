package cn.itcast.day04_����api��һ����.Demo_02_��������;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //��ͨʹ�÷�ʽ
        System.out.println("�Ӽ��������һ����");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("��ͨ��ʽ������������ǣ�" + num);

        //��������ʽ
        System.out.println("�Ӽ����������������һ����");
        int num2 = new Scanner(System.in).nextInt();
        System.out.println("������ʽ������������ǣ�" + num2);

        //ʹ�ó��淽���������
        System.out.println("����һ���������淽���������");
        Scanner sc1 = new Scanner(System.in);
        param.methodParam(sc1);

        //����������Ϊ��������
        System.out.println("�������������һ������,��Ϊ��������");
        Scanner sc2 = new Scanner(System.in);
        param.methodParam(sc2);


        //����������Ϊ����ֵ
        System.out.println("-----------------");
        System.out.println("����������Ϊ����ֵ��һ������");
        Scanner sc3 = param.methodReturn();
        int num3 = sc3.nextInt();
        System.out.println("-----------------");
        System.out.println("����ֵ��������ǣ�"+num3);
    }

}
