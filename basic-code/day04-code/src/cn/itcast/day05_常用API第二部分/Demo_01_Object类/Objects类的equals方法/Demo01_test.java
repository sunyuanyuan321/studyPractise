package cn.itcast.day05_����API�ڶ�����.Object��.Objects���equals����;

import java.util.Objects;

public class Demo01_test {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1.equals(s2));

        String s3 = null;
        String s4 = "abc";
           System.out.println(s3.equals(s4));  //��ָ���쳣
        //����  objects.equals����������
        boolean result = Objects.equals(s3, s4);
        System.out.println(result);  //false



    }

}
