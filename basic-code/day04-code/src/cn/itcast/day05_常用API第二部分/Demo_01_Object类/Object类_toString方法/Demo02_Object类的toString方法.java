package cn.itcast.day05_����API�ڶ�����.Demo_01_Object��.Object��_toString����;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Demo02_Object���toString���� {

    public static void main(String[] args) {
        cn.itcast.day05_����API�ڶ�����.Object��.Object��_toString����.Person str = new cn.itcast.day05_����API�ڶ�����.Object��.Object��_toString����.Person("����", 21);
        cn.itcast.day05_����API�ڶ�����.Object��.Object��_toString����.Person str2 = new cn.itcast.day05_����API�ڶ�����.Object��.Object��_toString����.Person("����", 18);

        //��ӡ���ǵ�ֵַ��û�����壬���ô�ӡ�ַ���
        System.out.println(str.toString());  //Object��.Person@1540e19d

        //�����������������࣬��û����д toString��������
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        System.out.println(str1.toString());  //�б���д

        Random ran = new Random(10);
        int a = ran.nextInt();
        System.out.println(a);   //-1157793070   û�б���д

        ArrayList<Integer> arrays = new ArrayList<>();
        arrays.add(1);
        arrays.add(5);
        System.out.println(arrays);   //[1, 5] ��д��
    }
}