package cn.itcast.day05_����API�ڶ�����.Object��.Object��_equals������д;

import java.util.Random;

public class equals {
    public static void main(String[] args) {
        String str1 = "aabbcc";
        System.out.println("bbccaa".equals(str1));
        String str2 = "aabbcc";
        System.out.println(str2.equals(str1));

        /*
        equals ԭ��
        public boolean equals(Object obj) {
            return (this == obj);
        }
        */
        cn.itcast.day05_����API�ڶ�����.Object��.Object��_equals������д.Person per1 = new cn.itcast.day05_����API�ڶ�����.Object��.Object��_equals������д.Person("����", 21);
        cn.itcast.day05_����API�ڶ�����.Object��.Object��_equals������д.Person per2 = new cn.itcast.day05_����API�ڶ�����.Object��.Object��_equals������д.Person("����", 21);
        cn.itcast.day05_����API�ڶ�����.Object��.Object��_equals������д.Person per3 = new cn.itcast.day05_����API�ڶ�����.Object��.Object��_equals������д.Person("����", 21);

        System.out.println(per2 + "          " + per3);
        System.out.println(per2.equals(per3));  //��Ȼ��false��ӦΪequals �Ƚϵ��� ��������ĵ�ֵַ

        String str3 = per2.toString();
        String str4 = per3.toString();

        System.out.println("toString��Ƚϣ�" + str3.equals(str4));//�Ƚϵ���������ֵַ

        System.out.println(per2.equals(per3));  //��д�� equals������������ ture

        Random ran = new Random(10);
        System.out.println(per1.equals(ran));  //ClassCastException ,��������������ת���жϵĻ�������
    }
}
