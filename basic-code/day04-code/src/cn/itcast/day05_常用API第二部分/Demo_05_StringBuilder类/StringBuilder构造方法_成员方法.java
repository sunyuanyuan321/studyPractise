package cn.itcast.day05_����API�ڶ�����.Demo_05_StringBuilder��;

public class StringBuilder���췽��_��Ա���� {
    public static void main(String[] args) {
        //Ĭ���޲ι��췽��
        StringBuilder sb1 = new StringBuilder();
        //�вι��췽��
        StringBuilder sb2 = new StringBuilder("abc");

        //append����,���
        sb2.append("cd");
        StringBuilder s2 = sb2.append("ef");
        System.out.println(s2.append(123)); //abccdef123
        System.out.println(s2.append("����"));

        //toString����������ǰStringBuilder����ת��ΪString����
        System.out.println(s2.equals("abccdef123����"));  //false
        s2.toString();
        System.out.println(s2.toString().equals("abccdef123����"));  //true

        //��ʽ���
        System.out.println(sb1.append("asd").append("123").append(456).append("������"));

    }
}
