package cn.itcast.day04_����api��һ����.Demo_05_String��;

public class Demo04_StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);

        //��ֵַ�ıȽ�
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println("=======================");

        //equals�����������ַ����������ݱȽ�
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));

        //�ַ����Ƚ϶���
        System.out.println("Hello".equals(str1));
        System.out.println(str1.equals("Hello"));

        //equals�������ϸ����ִ�Сд
        String str4 = "hello";
        System.out.println(str1.equals(str4));   //false

        //�Ƽ�ʹ�� "Hello".equals(str1)
        String str5 = null;
        System.out.println("Hello".equals(str5));  //false
        System.out.println(str5.equals("Hello"));  //���� ��ָ��  NullPointerException


    }
}
